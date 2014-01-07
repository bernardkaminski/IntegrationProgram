//just testing the program to verify it completes its task
public class Test {
public static void main(String [] args)
{
	Fx a = new Fx(2,1,0);

	Simpson s = new Simpson(a,4,1,5);

	System.out.print (""+s.integrate());



}

}