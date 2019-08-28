package ArrayList;

import java.util.ArrayList;

public class InsertionAndDeletion {

	public static void main(String[] args)
	{
		ArrayList <Integer>ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(2, 30);
		for(int x1:ar)
		{
			System.out.println(x1);
		}
		ar.remove(0);
		ar.remove(1);
		System.out.println("************");
		for(int x1:ar)
		{
			System.out.println(x1);
		}

	}

}
