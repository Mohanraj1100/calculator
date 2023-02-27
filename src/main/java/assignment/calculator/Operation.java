package assignment.calculator;

abstract class Operation 
{
	double num1;
	double num2;
	double ans;
	Operation(double x , double y)
	{
		num1 = x;
		num2 = y;
	}
	public abstract void calculation();
}
