package ExceptionalHandling;

public class ArrayIndexOutOfBounds {

	public static void main(String[] args)
	{
		try
		{
		int[] arr= {10,20};
		System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the program");

	}

}
