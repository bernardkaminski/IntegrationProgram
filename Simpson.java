public class Simpson
/*this is the class that does the magic, this class createa a sympson object that requires
 *an Fx object, the amount of divisions, bottom limit and top limit. once a simpson object is created
 * the user may use the integrate method to find the definate intigral.   */
{
	private double  divs, a, b;//divs is the amount of division a is bottom limit b is top limit
	private Fx F;//Fx class that contains function

	Simpson()
	{

		divs=0;
		a=0;
		b=0;

	}

	Simpson(Fx f, double d, double first, double second )

	{
		F=f;
		divs = d;
		a= first;
		b= second;


	}

	double integrate()
	{
		double answer = 0.0;//dummy value
		 double dif;//the difference between divisions
		 dif = (b-a) / (divs);//calculating the difference between divisions

			for(int i = 0 ; i < divs-1 ; i+=2 )//loop that computes the intigral using simpsons rule note it makes usse of compute method in Fx class
			{

				answer += (dif/3)*(F.Compute(a+(i*dif)) + 4 * F.Compute(a +((i+1)*dif)) + F.Compute (a + ((i+2)*dif) ));

			}

		return answer;
	}



}