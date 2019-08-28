package staticKeyword;
class Student
{
int id;
String name;
String college="ICE";

Student(int i,String r)
{
id=i;
name=r;
}
void display()
{
System.out.println(id+" "+name+" "+college);	
}
}
public class StaticExample
{

	public static void main(String[] args)
	{
		Student s=new Student(52461,"Sharad");
		Student s1=new Student(52460,"sameer");
	    s.display();
	    s1.display();

	}

}
