package constructor;
class Student1
{
int id;
String name;
int age;
Student1(int i, String n)
{
id=i;
name=n;
}
Student1(int i,String n, int a)
{
id=i;
name=n;
age=a;
}
public void display()
{
System.out.println(id+" "+name+" "+age);	
}
}
public class ConstructorOverloading {

	public static void main(String[] args)
	{
		Student1 s=new Student1(52461,"sharad");
		Student1 s2=new Student1(52461,"sharad",26);
		s.display();
		
		s2.display();

	}

}
