package array;

public class DeclarationCreationInitializationInSingleLine {

	public static void main(String[] args)
	{
		// In multiple line
		int[] arr;       // declearation
		arr=new int[2];  //  Creation
		arr[0]=10;       // Initialization
		arr[1]=20;
		
		// In a Single line, always remeber that no new keyword is used in doing it single line
		
		int[] array= {10,20,30}; 
		
		// Even we can override these values;
		array[0]=30;
		System.out.println(array[0]);  // 30

	}

}
