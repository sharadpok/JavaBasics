package array;

public class ArrayInitialization {

	public static void main(String[] args)
	{
		int[] array=new int[3];
		array[0]=10;
		array[1]=20;
		
		//array[4]=40;  RE: Array index out of bound exception
		//Prinitng the reference variable, we gets class name type
		System.out.println(array);  // 0/p: [I@4cc77c2e
		// If we not initialize on of the cell then by default value ids printed
		System.out.println(array[2]);
		
		//For 2D array
		int[][] arr=new int[2][1];
		System.out.println(arr);     // [[I@61064425
		System.out.println(arr[0]);  // [I@7b1d7fff
		System.out.println(arr[0][0]);// 0
		
		// we get runtime error if we perform any operation on null.
		int[][] ar=new int[2][];
		System.out.println(ar[0]); // Null
		System.out.println(ar[0][0]);  //RE: Null pointer exception
		

	}

}
