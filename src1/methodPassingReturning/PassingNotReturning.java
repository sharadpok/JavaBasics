package methodPassingReturning;

public class PassingNotReturning
{
public void CalcSquare(int num)
{
int res=num*num;
System.out.println(res);
}
	public static void main(String[] args)
	{
		PassingNotReturning obj=new PassingNotReturning();
		obj.CalcSquare(15);

	}

}
