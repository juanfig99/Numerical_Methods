import java.lang.Math;

public class NewtonRaphson
{
	static final double EPSILON = 0.00000000001;
	double x0;
	
	public NewtonRaphson()
	{
		x0 = 0.1;
	}
	
	// method to iterate the Newton Raphson method
	// returns the root of the given function
	public double iterateNR(Algebraic[] expr)
	{
		double g, gPrime;
		double x1 = 1;
		
		for (int i = 0; i < Integer.MAX_VALUE; i++)
		{
			g = f(expr,x0);
			gPrime = fPrime(expr,x0);
			
			x1 = x0 - g/gPrime;
			
			if(Math.abs(x1-x0) <= EPSILON)
			{
				System.out.println("Iteration stops at i = "+i);
				return x1;
			}
			x0 = x1;
		}
		System.out.println("Could not find root within classes break tolerance");
		return 0;
	}
	
	public double f(Algebraic[] arr, double x)
	{
		double eval = 0;
		for(int i = 0; i < arr.length; i++)
		{
			eval += arr[i].evalTermAt(x);
		}
		return eval;
	}
	
	public double fPrime(Algebraic[] arr, double x)
	{
		double eval = 0;
		for(int i = 0; i < arr.length; i++)
		{
			eval += arr[i].evalTermsDerivativeAt(x);
		}
		return eval;
	}
}
