package polymorphismMethodOverriding;
/*Variable resolution is always take care by the compiler based on the
reference type, irrespective of whether variable is static or 
non-static so always keep in mind that method overloading is takes 
place for the variables*/
class Super
{
int num=888;	
}
class Sub extends Super
{
int num=999;	
}
public class OverridingOfVariables
{

	public static void main(String[] args)
	{
		Sub s=new Sub();
		System.out.println(s.num);  //999
		
		Super s1=new Super();
		System.out.println(s1.num); //888

		Super s2=new Sub();       //888
		System.out.println(s2.num);
	}

}
