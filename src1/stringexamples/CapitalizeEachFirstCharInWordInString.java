package stringexamples;

public class CapitalizeEachFirstCharInWordInString
{

	public static void main(String[] args)
	{
		String name="sharad kalyan pokale";
		String[] splitName=name.split(" ");
	    for(int i=0;i<splitName.length;i++)
		{
		System.out.print(splitName[i].substring(0,1).toUpperCase()+splitName[i].substring(1)+" ");
		}
	}

}
