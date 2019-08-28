package accessModifiers;
import pack.*;
public class Protected extends D
{

	public static void main(String[] args)
	{
		Protected obj =new Protected();
		obj.msg();
//But if we remove extends D then this method will not be accessible.
	}

}
