package operators;

public class TernaryOperator {

	public static void main(String[] args)
	{
		int a=10,b=20;
	int	min=(a<b)?a:b;
	System.out.println("Minimun Value is: "+min);
	// we can perform nesting also of the ternary operator
	
		int x=(10>20)?30:((40>30)?60:70);
		System.out.println(x);
		
		// we can apply it for boolean values also
		boolean x1=(true==false)?true:false;
		System.out.println(x1);

	}

}
