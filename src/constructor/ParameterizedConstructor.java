package constructor;
class Student
{
int id;
String name;
Student(int i, String n)
{
id=i;
name=n;
}
public void display()
{
	System.out.println(id+" "+name);
}
}
public class ParameterizedConstructor {

	public static void main(String[] args)
	{
		Student s=new Student(52461,"sharad");
		s.display();

	}

}
