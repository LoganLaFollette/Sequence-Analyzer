package gui.commands;

import gui.MainWindow;

public class DebugCommand extends Command
{
	@Override
	public String getInvocation()
	{
		return "debug";
	}

	@Override
	public String getHelp()
	{
		return "Toggles the developer debug mode on/off";
	}

	@Override
	public String execute(String[] args) throws CommandException
	{
		MainWindow.DEBUG = !MainWindow.DEBUG;
		return "Debug Mode is now " + (MainWindow.DEBUG ? "on" : "off") + ".";
	}

}
