package ArrayList;

import java.util.ArrayList;

public class TraversingArrayUsingLoop {

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}

	}

}
