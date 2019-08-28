package inheritance;
class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Emp
{
int id;
String name;
Address address;
Emp(int id,String name, Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
public void display()
{
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}
}
public class Aggrigation {

	public static void main(String[] args)
	{
	   Address ad=new Address("Pune","Maharashtra","India");
	   Emp e=new Emp(52461,"sharad",ad);
	   e.display();
	   

	}

}
