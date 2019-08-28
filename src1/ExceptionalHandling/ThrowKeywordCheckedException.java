package ExceptionalHandling;

import java.io.IOException;

public class ThrowKeywordCheckedException {

	public static void main(String[] args) throws IOException
	{
		boolean fileStatus=false;
		if(fileStatus==true)
		{
			System.out.println("File is present");
		}else
		{
			throw new IOException("File is not available");
		}

	}

}
