package thisKeyword;
class Student2
{
int id;
String name;

Student2(int i,String n)

{
		id=i;
		name=n;
}
public void display()
{
System.out.println(id+" "+name);	
}
}
public class LocanAndInstanceVariableAreDifferent {

	public static void main(String[] args)
	{
		Student2 s=new Student2(52461,"Sharad");
		s.display();	

	}

}
