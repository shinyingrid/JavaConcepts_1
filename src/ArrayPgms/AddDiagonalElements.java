package ArrayPgms;

public class AddDiagonalElements 
{
	public static void main(String[] args)
	{
		int[][]a= {{3,5,7},{2,5,8},{1,3,5}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][i];
		}
		System.out.println(sum);
	}
}
