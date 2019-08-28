package interfaceTopic;
interface It16
{
double PI=3.14	;
}
interface It17
{
double PI=3.14	;
}
public class DuplicateVariable implements It16,It17
{

	public static void main(String[] args)
	{
		DuplicateVariable obj=new DuplicateVariable();
		//System.out.println(obj.PI); Field is ambigous

	}

}
