package arrayInterviewPrograms;

public class FindingTheDuplicateNumber {

	public static void main(String[] args)
	{
		//Find Out the duplicate number in the following array.
       int[] arr= {0,1,2,3,4,5,6,7,8,9,19,10};
       int ExptectedSum=0;
		for(int i=0;i<=10;i++)
		{
			ExptectedSum=ExptectedSum+i;
		}
		System.out.println("Summation from 1 to 10 number is:"+ExptectedSum);
       int ActualSum=0;
		for(int i=0;i<arr.length;i++)
		{
			ActualSum=ActualSum+arr[i];
		}
		System.out.println("Summation of given numbers:"+ActualSum);
		
		int res=ActualSum-ExptectedSum;
		if(res==0)
		{
			System.out.println("No Duplicate number is contain");
		}else if(res>10)
		{
			System.out.println("Number is not duplicate, but it is out of the series");
		}else
		{
		System.out.println("Duplicate Number is:"+res);
		}
	}

}
