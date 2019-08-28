package array;

public class AnonymousArray {

	public static void main(String[] args)
	{
		/*Anonymous Array is an array withou name. 
		The main purpose of the anonymous array is for instant use.
		(one Time Usage only)*/
		
		//How to initialize anonymous array
		//new int[] {10,20,30};
		sum(new int[] {10,20,30});
		
	}
	public static void sum(int[]arr)
	{
		int total=0;
		for(int x1:arr)
		{
			total=total+x1;
		}
		System.out.println("Summation is: "+total);
	}

}
