package gui.commands;

public abstract class Command
{
	/**
	 * @return A String that uniquely identifies this Command
	 */
	public abstract String getInvocation();
	
	/**
	 * @return A custom-made help string for this Command
	 */
	public abstract String getHelp();
	
	/**
	 * Perform this command
	 * @param args - The arguments following the command
	 * @return Whatever output the Command produced
	 */
	public abstract String execute(String[] args) throws CommandException;
}
