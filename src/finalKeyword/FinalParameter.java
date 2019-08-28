package finalKeyword;
class Square
{
public void squareOperation(final int x)
{
	//x=x*x; C.E--We cannot change it's value.
 }
}
public class FinalParameter {

	public static void main(String[] args)
	{
		Square s=new Square();
		s.squareOperation(45);
	}

}
