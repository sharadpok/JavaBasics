package mypack;
// As we are using the qualified fully name, we dont need to import.
public class UsingFullyQualifiedName {

	public static void main(String[] args)
	{
		pack.A obj=new pack.A();// using fully qualified name
		obj.msg();
		//we can use in-built classes also to import.
		java.lang.String ref=new java.lang.String();
		System.out.println(ref.length());

	}

}
