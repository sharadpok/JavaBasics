package thisKeyword;
class Student
{
	int id;
	String name;
	Student(int id,String name)
	{
		id=id;
		name=name;
	}
	public void display()
	{
		System.out.println(id+" "+name);
	}
}
public class ProblemWithoutThisKeyword
{

	public static void main(String[] args)
	{
		Student s=new Student(52461,"Sharad");
		s.display();

	}

}
