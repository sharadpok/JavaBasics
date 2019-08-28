package array;

public class ArrayCreation {

	public static void main(String[] args)
	{
		/*As Array is non-premitive type of data hence its need new
		operator to create it.
		We must have to specify the size in creation*/
	 int[] arr=new int[3];
	 
	 // We can create array with empty size.
	 int[] arr1=new int[0];
	 //If we specify the size of array in negative, then it gives error
    // int[] arr3=new int[-10];  //RE: Negative array size exception
     /*TO specify the array size only allowed data types are byte,short,int,char.
     If we tried with some different data type it will give compile time error*/
      // size=97
     byte b=20;
     int[] array1=new int[b];
     short s=20;
     int[] array2=new int[s];
     int i=10;
     int[] array3=new int[i];
     char ch='a';
     int[] array4=new int[ch];
     /*long l=10l;
     int[] array5=new int[l];*/  // Compile time eeror is getting
     
     // Maximum size for the array is maximum range of the int data type.
    int[] array6=new int[2147483647]; // RE: Requested array size exceeds array limit.
    // int[] array7=new int[2147483648];  // CE: Out of range
     
     
     
     
	}

}
