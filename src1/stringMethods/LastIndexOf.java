package stringMethods;
//from last index means from that index string will be cut(right part will be cut and only left part will be there) and
//whatever the remaining string is there from that we have take last one.
public class LastIndexOf {

	public static void main(String[] args)
	{
			String s="this is a table";
			System.out.println(s.lastIndexOf('a'));// 11
			System.out.println(s.lastIndexOf('a',10));//8
			System.out.println(s.lastIndexOf("is")); //5
			System.out.println(s.lastIndexOf("is",8));//5
			System.out.println(s.lastIndexOf("is",4));//2
			
			

	}

}
