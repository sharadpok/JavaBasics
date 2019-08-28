package doWhile;

public class FalseCondition {

	public static void main(String[] args)
	{
		do
		{
			System.out.println("True Condition");
		}while(false);
		System.out.println("False Condition");
/*   Note: Here though the condition gets failed, still loopis executing
   once*/
	}

}
