package PatternPrograms;

public class Pattern5 {

	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)  //--> For incrementing
			{
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--) // --> For decrementing
			{
				
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
