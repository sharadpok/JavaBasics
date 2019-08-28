package ArrayList;

import java.util.ArrayList;

public class RetailAll
{

	public static void main(String[] args)
	{
		ArrayList <String>ar=new ArrayList<String>();
		ar.add("sharad");
		ar.add("kalyan");
		ar.add("pokale");
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("sharad");
		ar1.add("Dada");
		ar1.add("Walmik");
		ar.retainAll(ar1); // It compares two ArrayList and prints only same elements
		for(String str:ar)
		{
			System.out.println(str);
		}

	}

}
