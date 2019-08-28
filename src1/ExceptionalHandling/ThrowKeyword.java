package ExceptionalHandling;

import java.sql.SQLException;

public class ThrowKeyword
{

	public static void main(String[] args) 
	{
		// Throw keyword is used to throw an exception explicitly.
		// We can throw checked as well as unchecked exception.
		//Generally it is used to throw custom exceptions.
		
		int age=17;
		if(age>18)
		{
			System.out.println("Welcome to vote");
		}else
		{
			throw new ArithmeticException("Not valid age");
		}
	

	}

}
