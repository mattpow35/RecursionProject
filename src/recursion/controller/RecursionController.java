package recursion.controller;

import javax.swing.JOptionPane;

import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;
import recursion.model.Timer;

public class RecursionController 
{
	
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public RecursionController()
	{
		this.baseFrame = new RecursionFrame(this);
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "hello");
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		mathTimer.startTimer();
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		return factorialResponse;
	}
	
	public String transferFibonacci(String value)
	{
		String fibResponse = "The fibonacci number of " + value + " is: ";
		mathTimer.startTimer();
		if(isValidFib(value))
		{
			fibResponse += mathTool.calculateFibonacci(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		return fibResponse;
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
	
	private boolean isValidFib(String current)
	{
		try
		{
			int test = Integer.parseInt(current);
			if(test >= 0)
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
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid postive Integer");
			return false;
		}
	}

}
