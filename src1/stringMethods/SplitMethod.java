package stringMethods;

public class SplitMethod {

	public static void main(String[] args)
	{
		String s="Welcome to javatpoint";
		String[] arr=s.split(" ");
		for(String w:arr)
		{
			System.out.println(w);
		}
		String[] arr1=s.split(" ", 2	);
		for(String s1:arr1)
		{
		System.out.println(s1);	
		}
		
	String s1="sharad";
	String[] arr2=s1.split("a");
	for(String s3:arr2)
	{
		System.out.println(s3);
	}

}}
