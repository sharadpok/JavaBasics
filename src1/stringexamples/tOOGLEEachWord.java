package stringexamples;

public class tOOGLEEachWord {

	public static void main(String[] args)
	{
		String name="sharad kalyan pokale";
		String[] splittedName=name.split(" ");
		for(String w:splittedName)
		{
			System.out.print(w.substring(0,1)+w.substring(1).toUpperCase()+" ");
		}

	}

}
