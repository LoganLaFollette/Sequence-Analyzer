package gui;

import java.util.ArrayList;

public final class Console
{
	/* Static Vars */
	
	// The singleton Console instance
	private static Console _instance;
	
	/* Instance Vars */
	
	// The history of commands entered in this session
	private ArrayList<String> history;
	private int historyPointer;
	
	
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
}
