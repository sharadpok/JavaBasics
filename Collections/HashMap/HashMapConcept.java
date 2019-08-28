package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4,"RFT");
		System.out.println(hm);
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		
		// Traverse the hashmap
		for(Entry<Integer, String> m:hm.entrySet())
		{
			//System.out.println(m.getKey()+" "+m.getValue());
			Integer key=m.getKey();
			String val=m.getValue();
			System.out.println(key+" "+val);	
		}
		hm.remove(4);
		System.out.println(hm);
		hm.put(4, "Quallisto");
		System.out.println(hm);
		
		// Storing the Object in the HashMap
		
		HashMap <Integer,Employee>hm1=new HashMap<Integer, Employee>();
		Employee em=new Employee("sharu",25,"QA");
		Employee em1=new Employee("Tushu",30,"DEV");
		Employee em2=new Employee("Prashant",33,"BA");
		
		hm1.put(1, em);
		hm1.put(2, em1);
		hm1.put(3, em2);
		// Iterating the same
		System.out.println("****Iterating Employee Object*****");
		for(Entry<Integer, Employee> e:hm1.entrySet())
		{
			Integer key=e.getKey();
			System.out.println("Employee: "+key+" info");
			Employee emp=e.getValue();
			System.out.println(emp.name+" "+emp.age+" "+emp.dept );
		
		}
		
		

	}

}
