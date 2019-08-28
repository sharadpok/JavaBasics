package ExceptionalHandling;

import java.io.IOException;
import java.sql.SQLException;
//Note: We cannot throw multiple exceptions.
public class ThowingMultipleExceptions
{

	public static void main(String[] args)throws Exception
	{
	 throw new IOException("Device Error");
	// throw new SQLException("SQL Device Error"); Unreachable code
	

	}

}
