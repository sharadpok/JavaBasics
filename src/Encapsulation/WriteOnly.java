package Encapsulation;
/*Here we will not get the output as getter method is not written.
Only user can set the value. Hence name is write only*/
class Student2
{
private String name;
public void setName(String name)
{
this.name=name;	
}
}
public class WriteOnly
{

	public static void main(String[] args)
	{
		Student2 ref=new Student2();
		ref.setName("sharad");
	}

}
