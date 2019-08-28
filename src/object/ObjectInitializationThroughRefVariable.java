package object;
class Student3
{
int id;
String name="Sharad";
}
public class ObjectInitializationThroughRefVariable {

	public static void main(String[] args)
	{
		Student3 s=new Student3();
		Student3 s1=new Student3();
		Student3 s2=new Student3();
		s.id=100;
		s.name="Sharad";
		s1.id=102;
		s1.name="Nilesh";
		s2.id=123;
		s2.name="Pravin";
		System.out.println("Id: "+s.id+" Name: "+s.name);
		System.out.println("Id: "+s1.id+" Name: "+s1.name);
		System.out.println("Id: "+s2.id+" Name: "+s2.name);

	}

}
