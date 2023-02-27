package assignment.calculator;

class Subtract extends Operation
{
	Subtract(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
		ans = num1 - num2;
	}
}
