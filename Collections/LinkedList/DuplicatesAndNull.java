package LinkedList;

import java.util.LinkedList;

public class DuplicatesAndNull
{

	public static void main(String[] args)
	{
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(10);
		System.out.println(ll);
		ll.add(null);
		System.out.println(ll);

	}

}
