package assignment.calculator;
import java.util.*;
import java.util.logging.Logger;
public class CalculatorOperation 
{
    public static void main( String[] args )
    {
    	double num1;
    	double num2;
    	double result;
    	Logger log = Logger.getLogger("hi");
    	Scanner sc = new Scanner(System.in);
	String str = "Enter number";
    	log.info(str);
    	num1 = sc.nextDouble();
    	Operation cl;
    	result = num1;
    	boolean ch = true;
    	while(ch)
    	{
        	log.info("Choose the Arithmetic Operation==>\n Addition-> +\n Substraction-> -\n Multiplication->*\n Division->/\n Exit the calculator-> e");
        	char operation = sc.next().charAt(0);
        	switch(operation)
        	{
        		case '+':
        		{
        			log.info(str);
                	num2 = sc.nextDouble();
        			cl = new Add(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case '-':
        		{
        			log.info(str);
                	num2 = sc.nextDouble();
        			cl = new Subtract(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case '*':
        		{
        			log.info(str);
                	num2 = sc.nextDouble();
        			cl = new Multiply(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case '/':
        		{
        			log.info(str);
                	num2 = sc.nextDouble();
        			cl = new Divide(result,num2);
        			cl.calculation();
        			result = cl.ans;
        			break;	
        		}
        		case 'e':
        		{
        			System.exit(0);
        			break;
        		}
        		default:
        		{
        			log.info("Invalid Option");
        			break;
        		}
        	}
        	String res = String.valueOf(result);
        	log.info(res);
    	}
    	sc.close();
    }
    
}
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
class Add extends Operation
{
	Add(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
		super.ans = super.num1 + super.num2;
	}
}
class Subtract extends Operation
{
	Subtract(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
		super.ans = super.num1 - super.num2;
	}
}
class Multiply extends Operation
{
	Multiply(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
		super.ans = super.num1 * super.num2;
	}
}
class Divide extends Operation
{
	Divide(double x , double y)
	{
		super(x,y);
	}
	public void calculation()
	{
			super.ans = super.num1 / super.num2;
	}
}
