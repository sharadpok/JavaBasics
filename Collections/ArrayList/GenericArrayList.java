package ArrayList;

import java.util.ArrayList;

public class GenericArrayList
{

	public static void main(String[] args)
	{
		ArrayList<Integer> ar=new ArrayList<Integer>();
		// So here this ArrayList can store only integer types of values 
		//and if we try to insert any other type value we will get error.
		ar.add(10);
		ar.add(20);
		ar.add(30);
		for(int x:ar)
		{
			System.out.println(x);
		}
		System.out.println("*******************");
		//ar.add(12.67); -- It is giving error like invalid data.
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("sharad");
		ar1.add("kalyan");
		ar1.add("pokale");
		for(String str:ar1)
		{
			System.out.println(str);
		}
		
		//Note: we have to use wrapper class for all the specified data type.
		//Similarly, we can use following types of generics to define the Array List.
		/*Byte
		Short
		Integer
		Long
		Float
		Double
		Character
		Boolean*/
		
		
		
		
		
		

	}

}
