package stringexamples;

public class ReverseEachWordInString {

	public static void main(String[] args)
	{
		String s="sharad kalyan pokale";
		String[] name=s.split(" ");
		for(int i=0;i<name.length;i++)
		{
			for(int j=name[i].length()-1;j>=0;j--)
			{
				System.out.print(name[i].charAt(j));
			}
			System.out.print	(" ");
		}

	}

}
