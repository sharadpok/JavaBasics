package mypack;
import pack.A;
// Here only the specified class will be imported in this file.
public class ImportWithClassName
{

	public static void main(String[] args)
	{
	   A obj=new A();
	   obj.msg();
	   //B ref=new B();  C.E.-->Not accessible 
	}

}
