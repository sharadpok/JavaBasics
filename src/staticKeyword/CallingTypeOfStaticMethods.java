package staticKeyword;

import dataTypes.StaticMethod;
class AnotherClass
{
public static void displaySurname()
{
	System.out.println("Pokale");
}
}
public class CallingTypeOfStaticMethods
{
	public static void displayName()
	{
		System.out.println("Sharad");
	}
	public static void main(String[] args)
	{
		displayName();
		/*we can call static method of the same class
		with directly by its name, But if it is in another class then
		we need to call it by using that class name*/
		AnotherClass.displaySurname();// As it is in another class of the same file
		Student1.change();// It is in the another java file but within the same package
	    StaticMethod.middleName();
        
	}

}
