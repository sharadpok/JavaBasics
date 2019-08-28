package Encapsulation;
/*Here we can only read the data, but cannot set the value.Hence it
is called read only class*/
class Student1
{
private String name="Sharad";
public String getName()
{
return name;	
}
}
public class ReadOnly {

	public static void main(String[] args)
	{
		Student1 ref=new Student1();
		System.out.println(ref.getName());
	}

}
