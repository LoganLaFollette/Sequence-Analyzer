package gui.commands;

import gui.Console;

public class ExitCommand extends Command
{
	@Override
	public String getHelp()
	{
		return "Exit the application without saving anything.";
	}

	@Override
	public int execute(String[] args)
	{
		Console.println("Exitting!");
		System.exit(0);
		return 0;
	}

}
