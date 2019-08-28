package staticKeyword;
import dataTypes.NonStaticMethod;
class Another
{
public void middleName()
{
System.out.println("Kalyan");	
}
}
public class CallingTypeOfNonStaticMetod
{
public void firstName()
{
System.out.println("Sharad");	
}
	public static void main(String[] args)
	{
		CallingTypeOfNonStaticMetod ref=new CallingTypeOfNonStaticMetod();
		ref.firstName(); // Within the same class
		Another a=new Another(); 
		a.middleName();   // different class but same java file
		NonStaticMethod1 ref2=new NonStaticMethod1();
		ref2.lastName();  // Same package but different java file
		NonStaticMethod ref3=new NonStaticMethod();
		ref3.rollNo();   // Different package: Need to import
		
		//These rules are applicable for the instance variables also. 
        
	

	}

}
