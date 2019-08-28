package operators;

public class InfiniteResultForIntgralAndFloating
{

	public static void main(String[] args)
	{
		/*In integral type(byte,short,int,long)there is no way to represent the infinite value so it gives runtime error
           But in floating point(float,double) there is way to represent the infinity hence we do not get any error.*/
		
		
		//System.out.println(10/0); // Runtime error : ArithmeticException: / by zero
		//System.out.println(-10/0); // ArithmeticException: / by zero
		System.out.println(10.0/0);
		System.out.println(10/0.0);
		System.out.println(-10.0/0.0);
		System.out.println(10/-0.0);
		//System.out.println(0/0); //   ArithmeticException: / by zero
		System.out.println("Undefined Result");
		System.out.println(0.0/0);  // NaN
		System.out.println(0/0.0);  // NaN
		System.out.println(-0.0/0); // NaN
		System.out.println(0/-0.0); // NaN
	}

}
