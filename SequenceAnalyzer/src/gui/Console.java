package gui;

import java.util.ArrayList;
import java.util.HashMap;

import gui.commands.*;

public final class Console
{
	private static final String COMMAND_FLAG = "/";
	
	/* Static Vars */
	
	// The singleton Console instance
	private static Console inst;
	
	// The list of all invokable commands
	private static HashMap<String, Command> commandList;
	static
	{
		//build the command list
		commandList = new HashMap<String, Command>();
		
		commandList.put("clear", new ClearCommand());
		commandList.put("debug", new DebugCommand());
		commandList.put("exit", new ExitCommand());
	}
	
	/* Instance Vars */
	
	// The history of commands entered in this session
	private ArrayList<String> history;
	private int historyIndex;
	
	// The GUI the Console operates upon
	private MainWindow front;
	
	/* Static Methods */
	
	/**
	 * Gets the ref to the singleton instance ifex, else creates a new instance
	 * @return A reference to the singleton instance
	 */
	public static Console instance()
	{
		if(inst == null)
			inst = new Console();
		return inst;
	}
	
	/**
	 * Print to the current Console instance's output
	 * @param s - the text to print
	 */
	public static void print(String s)
	{
		instance().front.printToOut(s);
	}
	
	/**
	 * Print to the current Console instance's output, appending a newline
	 * @param s - the text to print
	 */
	public static void println(String s)
	{
		instance().front.printlnToOut(s);
	}
	
	/**
	 * Remove all text from the current Console's output
	 */
	public static void clear()
	{
		instance().front.clearOut();
	}
	
	
	/* Instance Methods */
	private Console()
	{
		history = new ArrayList<String>();
		historyIndex = 0;
		
		//add an empty entry to the history so that a clear line can be selected
		history.add("");
		
		front = null;
	}
	
	/**
	 * Take the user input and check it for valid CLI commands
	 * @param input - the input string
	 * @return A boolean indicating whether a command was run
	 */
	public int processInput(String input)
	{
		if(!input.startsWith(COMMAND_FLAG))
			return -1;
		
		String[] args = input.substring(1).split(" ");
		
		int success = 1;
		
		if(commandList.containsKey(args[0]))
		{
			try
			{
				success =  commandList.get(args[0]).execute(args);
			}
			catch(Exception e)
			{
				//TODO print error message out to console
			}
		}
		
		return success;
	}
	
	/**
	 * Add an entry to the history
	 * @param entry - The String to be added
	 */
	public void addToHistory(String entry)
	{
		history.add(history.size() - 1, entry);
		historyIndex = history.size() - 1;
	}
	
	/**
	 * 
	 * @param n - The direction (positive or negative) to navigate in the history
	 * @return The selected entry in the history after navigation
	 */
	public String navigateHistory(int n)
	{
		historyIndex += Integer.signum(n);
		if(historyIndex < 0)
			historyIndex = 0;
		else if(historyIndex > history.size() - 1)
			historyIndex = history.size() - 1;
		
		return history.get(historyIndex);
	}
	
	/**
	 * Tie the singleton instance to a GUI instance
	 * @param front - a reference to the GUI instance
	 */
	public void setFront(MainWindow front)
	{
		this.front = front;
	}
}
