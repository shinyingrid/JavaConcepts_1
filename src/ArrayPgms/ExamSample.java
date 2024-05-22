package ArrayPgms;

public class ExamSample 
{
	public static void main(String[] args)
	{
		int[][]arr= {{3,2,1},{1,2,3}};
		for(int c=0;c<arr.length;c++)
		{
			for(int r=0;r<arr[0].length;r++)
			{
				if(arr[c][r]%2==1)
				{
					arr[c][r]=arr[c][r] + 1;
				}
			}
		}
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[0].length;c++)
			{
				System.out.println(arr[r][c]);
			}
			System.out.println();
		}
	}
}
