package SuperKeyword;
class Person
{
int id;
String name;
Person(int id,String name)
{
this.id=id;
this.name=name;
}
}
class Emp extends Person
{
	float salary;
Emp(int id,String name,float salary)
{
	super(id,name);
	this.salary=salary;
}
public void display()
{
System.out.println(id+" "+name+" "+salary);	
}
}
public class RealTimeUseOfSuper
{

	public static void main(String[] args)
	{
		Emp e=new Emp(1234, "Sharad", 28000.7f);
		e.display();

	}

}
