package ifElse;

public class NestedIf {

	public static void main(String[] args)
	{
		int age=17;
		int weight=70;
		if(age>21)
		{
			if(weight>60)
			{
				System.out.println("You are eligible for donating blood");
			}else
			{
				System.out.println("You are not eligible for blood donation, as weight is less");
			}
		}else
		{
			System.out.println("Your age is less than 18, please come next year for blood donation");
		}
	}

}
