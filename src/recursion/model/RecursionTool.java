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
		int num1 = 1;
		int num2 = 1;
		for(int i = 1; i < currentNumber; i ++)
		{
			num1 = num1+num2;
			num2 = num1-num2;
			
		}
		
		return num1;
	
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
