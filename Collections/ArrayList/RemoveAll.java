package ArrayList;

import java.util.ArrayList;

public class RemoveAll
{

	public static void main(String[] args)
	{
		ArrayList <String>ar=new ArrayList<String>();
		ar.add("sharad");
		ar.add("kalyan");
		ar.add("pokale");
		ArrayList<String> ar1=new ArrayList<String>();
		ar1.add("sharu");
		ar1.add("Dada");
		ar1.add("Walmik");
		ar.addAll(ar1);
		for(String str:ar)
		{
			System.out.println(str);
		}
		System.out.println("*****************");
		
		ar.removeAll(ar1);
		for(String str:ar)
		{
			System.out.println(str);
		}
		

	}

}
