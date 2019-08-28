package inheritance;
class Employee
{
float salary=40000;	
}
class programmer extends Employee
{
int bonus=1000;	
}
public class GeneralExample
{

	public static void main(String[] args)
	{
		programmer p=new programmer();
	    System.out.println("programmer salary is:"+p.salary);
	    System.out.println("programmer bonus is: "+p.bonus);

	}

}
