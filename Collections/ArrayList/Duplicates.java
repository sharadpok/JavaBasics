package ArrayList;

import java.util.ArrayList;

public class Duplicates {

	public static void main(String[] args)
	{
		// ArrayList can store duplicates and null insertion also.
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(10);
		System.out.println(ar);
		ar.add(null);
		System.out.println(ar);
		

	}

}
