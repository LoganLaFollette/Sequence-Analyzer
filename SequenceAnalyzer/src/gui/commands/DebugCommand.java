package gui.commands;

import gui.MainWindow;

public class DebugCommand extends Command
{
	@Override
	public String getHelp()
	{
		return "Toggles the developer debug mode on/off";
	}

	@Override
	public int execute(String[] args)
	{
		MainWindow.DEBUG = !MainWindow.DEBUG;
		// print "Debug Mode is now " + (MainWindow.DEBUG ? "on" : "off") + ".";
		return 0;
	}

}
