package whileLoop;

public class UnreachableCodeCases {

	public static void main(String[] args)
	{
		// Please refer notebook for this.
		final int a=10,b=20;
		while(a<b)
		{
			System.out.println("True");
		}
		/*System.out.println("False"); -Unreachable code Remaining
		cases are also applicable for the this while loop of the for loop.*/

	}

}
