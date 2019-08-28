package ifElse;

public class ElseIFLadder {

	public static void main(String[] args)
	{
		int marks=99;
		if(marks<50)
		{
			System.out.println("You are fail");
		}else if(marks>=50 && marks<60)
		{
			System.out.println("You have D grade");
		}else if(marks>=60 && marks<70)
		{
			System.out.println("You have C grade");
		}else if(marks>=70 && marks<80)
		{
			System.out.println("You have B grade");
		}else if(marks>=80 && marks<90)
		{
			System.out.println("You have A grade");
		}else if(marks>=90 && marks<100)
		{
			System.out.println("You are toper and A+ grade");
		}
		else
		{
			System.out.println("Invalid marks");
		}

	}

}
