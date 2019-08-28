package stringMethods;
/*When the intern() method is executed then it checks whether the 
String equals to this String Object is in the pool or not.
If it is available, then the string from the pool is returned. 
Otherwise, this String object is added to the pool and a reference 
to this String object is returned.*/
public class Intern
{

	public static void main(String[] args)
	{
	String s1="sharad";
	String s2=new String("sharad");
	//System.out.println(s1==s2);
	String s3=s2.intern();
	System.out.println(s3==s1);
	
	}

}
