package stringexamples;

public class CountNoOfWords {

	public static void main(String[] args)
	{
		int count = 0;
		String sen="India is my      country";
		String[] split=sen.split("\\s");
		for(int i=0;i<split.length;i++)
		{
			if(split[i]==" ")
			{
				continue;
			}else
			{
				count++;
			}
			    
		}
		System.out.println("No of words are: "+count);
		

	}

}
