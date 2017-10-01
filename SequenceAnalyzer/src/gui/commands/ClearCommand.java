package gui.commands;

import gui.Console;

public class ClearCommand extends Command
{
	@Override
	public String getInvocation()
	{
		return "clear";
	}

	@Override
	public String getHelp()
	{
		return "Clears the output of the CLI.";
	}

	@Override
	public String execute(String[] args) throws CommandException
	{
		try
		{
			Console.instance().getFront().clearCLIOut();
		}
		catch(NullPointerException npe)
		{
			return "No output to clear!";
		}
		return "";
	}

}
