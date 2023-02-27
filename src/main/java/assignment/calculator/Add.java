package assignment.calculator;

class Add extends Operation
{
	Add(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
		ans = num1 + num2;
	}
}
