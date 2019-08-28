package polymorphismMethodOverloading;
	
public class OverloadingMainMethod {

	public static void main(String[] args)
	{
		System.out.println("main with String array");

	}
	public static void main(String args)
	{
		System.out.println("main with String");

	}
	public static void main(int[] args)
	{
		System.out.println("main with int array");

	}
	public static void main(int args)
	{
		System.out.println("main with int");

	}

}
