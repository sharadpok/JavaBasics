package thisKeyword;
class Student1
{
int id;
String name;

Student1(int id,String name)

{
		this.id=id;
		this.name=name;
}
public void display()
{
System.out.println(id+" "+name);	
}
}
public class SolutionWithThisKeyword
{

	public static void main(String[] args)
	{
		Student1 s=new Student1(52461,"Sharad");
		s.display();	

	}

}
