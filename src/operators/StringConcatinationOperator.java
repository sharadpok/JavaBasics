package operators;

public class StringConcatinationOperator {

	public static void main(String[] args)
	{
		/*In java only plus operator is act as a operator overloaded,
		because sometimes it acts like concatination while sometimes
		act as a arithmetic operator. When at least one argument is
		string, then it acts as a concatination where as if both the 
		arguments are numbers then it acts as a arithmetic operator.*/
		
		String a="Sharad";
		int b=10,c=20,d=30;
		System.out.println("Result is: "+(a+b+c+d)); // sharad102030
		System.out.println("Result is: "+(b+c+d+a));//  60sharad
		System.out.println("Result is: "+(b+c+a+d));//  30sharad30
		System.out.println("Result is: "+(b+a+c+d));//  10sharad2030

	}

}
