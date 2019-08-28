package array;

public class JTAnonymousArray {

	public static void main(String[] args)
	{
		printArray(new int[] {10,20,30,40});

	}
	public static void printArray(int[] arr)
	{
		for(int x1:arr)
		{
			System.out.print(x1+" ");
		}
	}	

}
