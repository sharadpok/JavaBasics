package array;

public class JTAdditionOfTwoMatrices {

	public static void main(String[] args)
	{
		int[][] arr1= {{10,20,30},{10,20,30}};
		int[][] arr2= {{10,20,30},{10,20,30}};
		int[][] arr3=new int[2][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}

	}

}
