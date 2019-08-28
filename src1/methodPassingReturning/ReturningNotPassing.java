package methodPassingReturning;

public class ReturningNotPassing
{
public int CalcSquare()
{
int num=17;
return num*num;
}
	public static void main(String[] args)
	{
		ReturningNotPassing obj=new ReturningNotPassing();
			System.out.println(obj.CalcSquare());

	}

}
