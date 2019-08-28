package methodPassingReturning;

public class NoPassNoReturn
{
public void calcSquare()
{
int a=20;
int res=a*a;
System.out.println(res);
}

	public static void main(String[] args)
	{
		NoPassNoReturn obj=new NoPassNoReturn();
		obj.calcSquare();
		
	}

}
