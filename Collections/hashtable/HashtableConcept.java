package hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept
{

	public static void main(String[] args)
	{
		//It is similar to the HashMap but it is synchronized
		//It store the values in the basis of key value basis.
		//key-->Object-->Hashcode-->value
		
		//Adding values and printing the same:
		Hashtable <Integer, String>ht=new Hashtable<Integer, String>();
		ht.put(1, "Sharad");
		ht.put(2, "Walmik");
		ht.put(3, "Dada");
		
		System.out.println(ht);
		
		// Create the clone copy/shallow copy
		Hashtable<Integer, String> ht1=new Hashtable<Integer, String>();
		ht1=(Hashtable<Integer, String>) ht.clone();
		System.out.println("Values from ht: "+ht);
		System.out.println("Values from ht1: "+ht1);
		
		//Contains Value:It check the specified value and returns true if found.
			Hashtable<String,String> ht2=new Hashtable<String,String>();
			ht2.put("A", "Apple");
			ht2.put("B", "Ball");
			ht2.put("C", "Cat");
			if(ht2.contains("Applee"))
			{
				System.out.println("Value is found");
			}else
			{
				System.out.println("Value is not found");
				
			// Iterating using the enumeration
				System.out.println("Iterating using enumeration");
				Enumeration e=ht2.elements();
				while(e.hasMoreElements())
				{
					//System.out.println(e.nextElement());
					Object o=e.nextElement();
					System.out.println(o);
				}
			}
			
			//Iterating using the SetEntry method
			System.out.println("Iterating using the set entry method");
			Set s=ht2.entrySet();
			System.out.println(s);
			
			//Checking both hashtables are equals are not
			Hashtable<String,String> ht3=new Hashtable<String,String>();
			ht3.put("A", "Apple");
			ht3.put("B", "Ball");
			ht3.put("C", "Cat");
			
			if(ht2.equals(ht3))
			{
				System.out.println("Both are equal");
			}else
			{
				System.out.println("Both are not equal");
			}
			
			// Getting the key
			System.out.println("Key from the ht3: "+ht3.get("A"));
			
			//Getting the hashcode
			System.out.println("Getting the hashcode: "+ht3.hashCode());
			// We canot put same key or value, if put it will not print, just ignore
			
			Hashtable<String,String> ht4=new Hashtable<String,String>();
			ht4.put("A", "Apple");
			ht4.put("B", "Ball");
			ht4.put("B", "Ball");
			ht4.put("C", "Apple");
			System.out.println("Ht4 values: "+ht4); // But we can have duplicate value but not duplicate key
			
			// we cannot put either null key or the null value
			Hashtable<String,String> ht5=new Hashtable<String,String>();
			ht5.put("A", "Apple");
			ht5.put("B", "Ball");
			//ht5.put(null, "Cat");
			ht5.put("D", null);
			System.out.println(ht5);
			
			
			System.out.println(ht5);
			
			
			
		
		
		
			

	}

}
