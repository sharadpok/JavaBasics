package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Methods {

	public static void main(String[] args)
	{
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("This");
		ll.add("is");
		ll.add("javatpoint");
		System.out.println("Contenet is: "+ll);
		//addFirst
		ll.addFirst("Website");
		System.out.println("Content is: "+ll);
		//addLast
		ll.addLast("Use");
		System.out.println("Content is: "+ll);
		//get
		String str=ll.get(1);
		System.out.println(str);
		System.out.println(ll.get(2));
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//set
		ll.set(3, "java");
		System.out.println("Content is: "+ll);
		ll.add(3, "Good");
		System.out.println("Content is: "+ll);
		//remove first
		ll.removeFirst();
		System.out.println("Content is: "+ll);
		//remove last
		ll.removeLast();
		System.out.println("Content is: "+ll);
		//remove at index
		ll.remove(2);
		System.out.println("Content is: "+ll);
		
		//for loop
		System.out.println("*****Using For Loop*****");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		//Advance For Loop
		System.out.println("*******Using Advance Loop*****");
		for(String str1:ll)
		{
			System.out.println(str1);
		}
		//Iterator
		System.out.println("*******Using Iterator*******");
		Iterator<String> itr=ll.iterator();
		while(itr.hasNext())
		{
			String st=itr.next();	
			System.out.println(st);
		}

		//While loop
		System.out.println("*******Using While Loop*****");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
	}

}
