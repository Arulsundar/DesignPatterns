package com.behavioural.command;


public class ButtonInvoker {
	
	Command command;
	
	public ButtonInvoker(Command command)
	{
		this.command=command;
	}
	
	void press()
	{
		command.execute();
	}

}
