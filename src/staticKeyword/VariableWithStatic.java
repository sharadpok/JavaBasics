package staticKeyword;
class Counter1
{
static int count=0;
/*Here single copy of this static variable is shared among 
all the objects hence each time when we create the object previous
value is taken and perform the action*/
Counter1()
{
count++;
System.out.println(count);
}
}
public class VariableWithStatic {

	public static void main(String[] args)
	{
		Counter1 c=new  Counter1();
		Counter1 c1=new Counter1();
		Counter1 c2=new Counter1();

	}

}
