package staticKeyword;
class Counter
{
int count=0;   
/*Here each object will have the separate copy
of instance variable. So after creation of each new object, it will 
assign to zero and printing the same result*/
Counter()
{
count++;
System.out.println(count);
}
}
public class VariableWithoutStatic
{

	public static void main(String[] args)
	{
		Counter c=new Counter();
		Counter c1=new Counter();
		Counter c2=new Counter();
		

	}

}
