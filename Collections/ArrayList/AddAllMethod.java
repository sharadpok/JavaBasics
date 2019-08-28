package ArrayList;

import java.util.ArrayList;

public class AddAllMethod {

	public static void main(String[] args)
	{
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("sharu");
		ar.add("Walmik");
		ar.add("Dada");
		
		ArrayList<String> ar1=new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		
		ar.addAll(ar1);
		for(String lst:ar)
		{
			System.out.println(lst);
		}

	}

}
