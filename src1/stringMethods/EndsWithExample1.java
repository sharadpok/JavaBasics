package stringMethods;

public class EndsWithExample1 {

	public static void main(String[] args)
	{
		String s1="java by javatpoint";
		System.out.println(s1.endsWith("t"));  // true
		boolean s2=s1.endsWith("point");
		System.out.println(s2); // true
		System.out.println(s1.endsWith("t ")); //false
		
		if(s1.endsWith("point"))
		{
			System.out.println("String ends with point");
		}else
		{
		  System.out.	println("String does not ends with point");
		}
		

	}

}
