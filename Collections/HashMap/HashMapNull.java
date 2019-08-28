package HashMap;

import java.util.HashMap;

public class HashMapNull {

	public static void main(String[] args)
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "sp");
		//hm.put(2, "dada");
		//hm.put(3, null);
	//	hm.put(4, null);
		//hm.put(5, null);
		hm.put(null, "skp");
		hm.put(null, "st");
		System.out.println(hm);
		

	}

}
