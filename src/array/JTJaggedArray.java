package array;

public class JTJaggedArray {

	public static void main(String[] args)
	{
		/*Jagged Array: In multidimensional array, if odd numbers of
		columns are present then it is called as jagged araay*/
		int[][] arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[4];
		
		//Initializing the array
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		}
		//Printing the same array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
