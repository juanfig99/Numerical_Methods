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
		double eval = coeff * exp * Math.pow(x,exp-1);
		return eval;
	}
	public void display(int pos)
	{
		if(pos == 0)
			System.out.print(coeff+""+var);
		else if(this.coeff > 0)
			System.out.print(" + "+coeff+""+var);
		else
			System.out.print(" - "+(-1)*coeff+""+var);
		if(this.exp != 1)
			System.out.print("^("+exp+")");
	}
}