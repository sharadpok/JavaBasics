package ArrayList;

import java.util.ArrayList;

public class FetchingElement {

	public static void main(String[] args)
	{
		// As it is index based so it is very easy to fetch any element
		// Hence it is best choice if frequent opearation is retrival of the data.
		//and worst case if deletion or insertion operation has to be performed.
		
	ArrayList ar=new ArrayList();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	ar.add(40);
	System.out.println(ar.get(0));
	System.out.println(ar.get(1));
	System.out.println(ar.get(2));
	

	}

}
