package arrayInterviewPrograms;

public class FindingTheMissingNumber {

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,7,6,8,9};
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
		
		System.out.println("Missing number is:"+(ExptectedSum-ActualSum));
	}

}
