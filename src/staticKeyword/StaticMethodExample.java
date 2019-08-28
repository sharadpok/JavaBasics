package staticKeyword;
class Student1
{
int id;
String name;
static String college="ICE";
Student1(int i,String n)
{
id=i;
name=n;
}
public static void change()
{
college="CEOP";	
}
public void display()
{
System.out.println(id+" "+name+" "+college);	
}
}
public class StaticMethodExample
{

	public static void main(String[] args)
	{
		Student1 s=new Student1(52461,"sharad");
	    Student1.change();
	    /*If we do not call to this method then
	    we will get result as ICE college name*/
		s.display();

	}

}
