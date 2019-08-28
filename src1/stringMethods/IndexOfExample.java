package stringMethods;

public class IndexOfExample
{

	public static void main(String[] args)
	{
		String s1="This is my laptop";
		int index=s1.indexOf('s');
		System.out.println(index); //3
		int index2=s1.indexOf('s', 4);
		System.out.println(index2);  //6
		int index3=s1.indexOf("is");
		System.out.println(index3); //2
		int index4=s1.indexOf("is", 4);
		System.out.println(index4); //5

	}

}
