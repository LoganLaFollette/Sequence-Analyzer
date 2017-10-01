package gui;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import gui.commands.Command;
import gui.commands.CommandException;

public final class Console
{
	private static final String COMMAND_FLAG = "/";
	
	/* Static Vars */
	
	// The singleton Console instance
	private static Console _instance;
	
	// The list of all invokable commands
	private static HashMap<String, Command> commandList;
	static
	{
		commandList = new HashMap<String, Command>();
		String commandDir = System.getProperty("user.dir") 
				+ File.separator + "src" 
				+ File.separator + "gui" 
				+ File.separator + "commands";
		
		System.out.println(commandDir); //DEBUG
		
		File[] dir = new File(commandDir).listFiles();
		for(File f : dir)
		{
			if(!f.isFile())
				continue;
			
			String filename = f.getName().substring(0, f.getName().lastIndexOf('.'));
			
			if(filename.equals("Command") || filename.equals("CommandException"))
				continue;
			
			Command c = null;
			try
			{
				c = (Command)Class.forName("gui.commands."+filename).newInstance();
			}
			catch (InstantiationException e) { e.printStackTrace(); }
			catch (IllegalAccessException e) { e.printStackTrace(); }
			catch (ClassNotFoundException e) { e.printStackTrace(); }
			
			commandList.put(c.getInvocation(), c);
		}
	}
	
	/* Instance Vars */
	
	// The history of commands entered in this session
	private ArrayList<String> history;
	private int historyPointer;
	
	// The GUI the Console operates upon
	private MainWindow front;
	
	/* Static Methods */
	
	/**
	 * Gets the ref to the singleton instance ifex, else creates a new instance
	 * @return A reference to the singleton instance
	 */
	public static Console instance()
	{
		if(_instance == null)
			_instance = new Console();
		return _instance;
	}
	
	
	/* Instance Methods */
	private Console()
	{
		history = new ArrayList<String>();
		historyPointer = 0;
		
		//add an empty entry to the history so that a clear line can be selected
		history.add("");
		
		front = null;
	}
	
	/**
	 * Take the user input and check it for valid CLI commands
	 * @param input - the input string
	 * @return A boolean indicating whether a command was run
	 */
	public boolean processInput(String input, String output)
	{
		if(!input.startsWith(COMMAND_FLAG) || output == null)
			return false;
		
		String[] args = input.substring(1).split(" ");
		
		if(commandList.containsKey(args[0]))
		{
			try
			{
				output += commandList.get(args[0]).execute(args);
			}
			catch(CommandException ce)
			{
				output += "ERROR: " + ce.getMessage();
			}
			return true;
		}
		
		return false;
	}
	
	/**
	 * Add an entry to the history
	 * @param entry - The String to be added
	 */
	public void addToHistory(String entry)
	{
		history.add(history.size() - 1, entry);
		historyPointer = history.size() - 1;
	}
	
	/**
	 * 
	 * @param n - The direction (positive or negative) to navigate in the history
	 * @return The selected entry in the history after navigation
	 */
	public String navigateHistory(int n)
	{
		historyPointer += Integer.signum(n);
		if(historyPointer < 0)
			historyPointer = 0;
		else if(historyPointer > history.size() - 1)
			historyPointer = history.size() - 1;
		
		return history.get(historyPointer);
	}
	
	/**
	 * Tie the singleton instance to a GUI instance
	 * @param front - a reference to the GUI instance
	 */
	public void setFront(MainWindow front)
	{
		this.front = front;
	}
	public MainWindow getFront()
	{
		return front;
	}
}
