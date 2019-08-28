package thisKeyword;
class Student3
{
int id;
String name,course;
double fees;
Student3(int id,String name,String course)
{
	this.id=id;
	this.name=name;
	this.course=course;
}
Student3(int id,String name,String course,double fees)
{
this(id,name,course);
this.fees=fees;
}
public void display()
{
System.out.println(id+" "+name+" "+course+" "+fees);	
}
}
public class ConstructorChaining
{

	public static void main(String[] args)
	{
		Student3 s=new Student3(234,"Sharad","java");
		s.display();
		Student3 s1=new Student3(234,"Sharad","java",6000);
		s1.display();

	}

}
