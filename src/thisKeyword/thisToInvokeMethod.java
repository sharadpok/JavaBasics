package thisKeyword;

public class thisToInvokeMethod
{
public void m()
{
System.out.println("Hello m");	
}
public void n()
{
	//m();// it is same as this.m();
	this.m();
System.out.println("Hello n");	
}
	public static void main(String[] args)
	{
		thisToInvokeMethod ref=new thisToInvokeMethod();
		ref.n();
		new thisToInvokeMethod().n();// same as the above
		

	}

}
