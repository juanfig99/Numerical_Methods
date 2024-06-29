import java.lang.Math;

public class Algebraic
{ 
	double coeff, exp;
	String var;
	
	public Algebraic(double coeff, double exp, String var)
	{
		this.coeff = coeff;
		this.exp = exp;
		this.var = var;
	}
	
	public void changeTerm(double coeff, double exp, String var)
	{
		this.coeff = coeff;
		this.exp = exp;
		this.var = var;
	}
	
	public double evalTermAt(double x)
	{
		double eval = coeff * Math.pow(x,exp);
		return eval;
	}
	
	public double evalTermsDerivativeAt(double x)
	{
		if(exp == 0)
			return 0;
		
		double eval = coeff * exp * Math.pow(x,exp-1);
		return eval;
	}
	
	public void display(int pos)
	{
		if(pos == 0)
			System.out.print(coeff);
		else if(coeff > 0)
			System.out.print(" + "+coeff);
		else
			System.out.print(" - "+(-1)*coeff);
		if(exp != 1 && exp != 0)
			System.out.print(var+"^("+exp+")");
	}
}
