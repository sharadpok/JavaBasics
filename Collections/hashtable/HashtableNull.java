package hashtable;

import java.util.Hashtable;

public class HashtableNull {

	public static void main(String[] args)
	{
		Hashtable <Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(1, "sp");
		ht.put(2, null);
		System.out.println(ht);
		
		

	}

}
