package recursion.model;

public class RecursionTool 
{
	public double calculateFactIterative(double currentNumber)
	{
		double factorial = 1;
		
		while (currentNumber > 0)
		{
			factorial = factorial * currentNumber;
			currentNumber --;
		}
		
		return factorial;
	}
	
	public int calculateFibIterative(int currentNumber)
	{
		return currentNumber;
	}
	
	public double calculateFactorial(double currentNumber)
	{
		if (currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1)*currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber -1) + calculateFibonacci(currentNumber -2);
		}
	}

}
