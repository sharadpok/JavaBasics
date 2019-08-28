package polymorphismMethodOverriding;
/*If we try to override var arg method with genral method, then it 
becomes method overloading. but if we use both methods as a var arg
then it is method overriding.*/
class Parent3
{
public void m1(int...x)
{
System.out.println("Var-Arg Method");	
}
}
class Child3 extends Parent3
{
public void m1(int x)
{
System.out.println("General Method");	
}
}
public class OverridingOfVarArgMethod {

	public static void main(String[] args)
	{
     Child3 ch=new Child3();
     ch.m1(); // var-arg   gen
     
     Parent3 p=new Parent3();
     p.m1();  // var-arg  var
     
     Parent3 p1=new Child3();
     p1.m1(); // var-arg   gen

	}

}
