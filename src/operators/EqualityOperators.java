package operators;

public class EqualityOperators {

	public static void main(String[] args)
	{
		/*Equality operators ==,!= can be applid to the every 
		premitive data types including boolean type also. This 
		operator is used to compare two values in premitive data
		types, but applied for object, then compares reference(add)*/
		
		System.out.println(10==20); // false
		System.out.println(10!=20); // true
		System.out.println('a'=='b');// false
		System.out.println('a'!='b');// true
		System.out.println('a'==97.0); //true
		System.out.println(true==false);//false
		
		// Difference Between == and .equals method
		
		String s=new String("Sharad"); 
		String s1=new String("Sharad");
		System.out.println("Reference comparision: "+(s==s1)); // false because add of both s and s1 is different.
		System.out.println("Content comparision: "+s.equals(s1));// true
		System.out.println("Reference comparision: "+(s!=s1)); //true
		
		
				

	}

}
