package staticKeyword;

public class CallingStaticIntoNonSttic {
public static int rollNo=52461;
public static void displayName()
{
System.out.println("Sharad Kalyan Pokale");	
}
public void callingStaticContext()
{
	displayName();  // without creating object
	System.out.println(rollNo);
	
}

	public static void main(String[] args)
	{
		CallingStaticIntoNonSttic ref=new CallingStaticIntoNonSttic();
		ref.callingStaticContext();

	}

}
