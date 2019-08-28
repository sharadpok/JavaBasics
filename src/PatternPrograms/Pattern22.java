package PatternPrograms;

public class Pattern22 {

	public static void main(String[] args)
	{
		for(char i='E';i>='A';i--)
		{
			for(char j='E';j>i;j--)
			{
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
