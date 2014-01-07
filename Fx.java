/*This class is the class that the user may alter in order to
 *change the type of function that will be integrated.
 *they must change what the compute method does but may keep what the class intakes as variables */

public class Fx
{
	private int degree, multiple, constant;
	private int start, finish;
		Fx ()//the default function is a polynomial whith the formula (multiple*x^degree+constant)
		{
			degree = 0;
			multiple = 0;
			constant = 0;
		}

		Fx (int d, int m, int c)//setting the variables
		{
			degree = d;
			multiple = m;
			constant = c;

		}

		double Compute(double x)/*the evalutes the y value at the given x value. This is what the user should mainly change to alter what funtion they wish to be used,
		for example if the user wishes to change it to a sin function the x must be changed to math.sin(x) */
		{
			double answer = multiple*(Math.pow(x,degree)) + constant ;
			return answer;
		}

		int getDegree()//sample getter
		{
			return degree;
		}

}