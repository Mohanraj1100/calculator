package assignment.calculator;

class Multiply extends Operation
{
	Multiply(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
		ans = num1 * num2;
	}
}
