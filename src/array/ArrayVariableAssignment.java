package array;

import java.util.logging.Level;

public class ArrayVariableAssignment {

	public static void main(String[] args)
	{
		/*Array element promotions are not applicable for the 
		array Level.
		We can assign char type of data type to int, but can not
		assign char type of array to the int type of array.*/
		
		//For premitive type of array we cannot assign char to int and vice versa
		int[] i= {10,20};
		char[] ch= {'a','b'};
	//	i=ch;    CE:
		
		// But For object type we can assign it's child class objects.
		String[] s= {"A","B"};
		Object[] o=s;
		for(Object o1:o)
		{
			System.out.println(o1);
		}
		
		

	}

}
