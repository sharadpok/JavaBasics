package polymorphismMethodOverriding;
class NonStatic1
{
public void m1()
{
System.out.println("Non-static method");	
}
}
class StaticMethod1 extends NonStatic1
{
//public static void m1();C.E static method can't hide instance mtd
{
	
}
}
public class NonStaticASStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
