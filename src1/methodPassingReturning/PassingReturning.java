package methodPassingReturning;

public class PassingReturning
{
public int CalcSquare(int num)
{
int res=num*num;
return res;
}
	public static void main(String[] args)
	{
		PassingReturning obj=new PassingReturning();
		int res=obj.CalcSquare(19);
		System.out.println(res);

	}

}
