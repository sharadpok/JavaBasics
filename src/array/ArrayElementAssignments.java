package array;

public class ArrayElementAssignments {

	public static void main(String[] args)
	{
		/*In premitive type of array, as a array elements we can provide
		any type of data type which will be implicitly promoted to
		declared type of array.*/
		
		int[] arr=new int[5];
		byte b=10;
		arr[0]=b;
		short s=20;
		arr[1]=s;
		int i=30;
		arr[2]=i;
		char ch='A';
		arr[3]=ch;
		float f=12.45f;
		//array[4]=f;  It is not taking
		for(int x1:arr)
		{
			System.out.print(x1+" ");
		}
		
		/*If the array is object type, then We can provide declared type
		and it's child class objects as a array elemetns.
*/		
		Object[] o=new Object[3];
		o[0]=new Object();
		o[1]=new String("sharad");
		o[2]=new Integer(10);
		System.out.println("This is object type of class");
		for(Object o1:o)
		{
			System.out.print(o1+" ");
		}
		

	}

}
