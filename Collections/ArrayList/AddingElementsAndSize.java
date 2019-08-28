package ArrayList;

import java.util.ArrayList;

public class AddingElementsAndSize
{

	public static void main(String[] args)
	{
		//Size can increase dynamically.
		ArrayList ar=new ArrayList();
		System.out.println(ar.size());
		ar.add(23);
		ar.add(30);
		ar.add(40);
		System.out.println(ar.size());
		// We can add duplicates values also.
		ar.add(23);
		ar.get(1);
		System.out.println("whats the output"+ar.get(1));
		System.out.println(ar);
		
		
		

	}
}
