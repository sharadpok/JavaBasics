package array;

public class JTReturningArrayFromMethod {

	public static void main(String[] args)
	{
	  int[] arr=printingArray();
	  for(int arr1:arr)
	  {
		  System.out.print(arr1+" ");
	  }
	}
	
	 public static int[] printingArray()
	{
		return new int[] {10,20,30};
	}

}
