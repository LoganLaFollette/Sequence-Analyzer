package gui.commands;

public class ExitCommand extends Command
{
	@Override
	public String getInvocation()
	{
		return "exit";
	}

	@Override
	public String getHelp()
	{
		return "Exit the application without saving anything.";
	}

	@Override
	public String execute(String[] args) throws CommandException 
	{
		System.exit(0);
		return "Exiting...";
	}

}
