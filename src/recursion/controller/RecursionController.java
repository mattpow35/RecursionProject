package recursion.controller;

import javax.swing.JOptionPane;

import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;

public class RecursionController 
{
	
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	
	public RecursionController()
	{
		this.baseFrame = new RecursionFrame(this);
		this.mathTool = new RecursionTool();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "hello");
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		return factorialResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			double test = Double.parseDouble(current);
			if (test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid positve Integer");
			return false;
		}
	}

}
