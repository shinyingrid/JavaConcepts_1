package ArrayPgms;

public class LinearSearch
{
	public static void main(String[] args)
	{
		int[]a = {3,8,1,5,9,2};
		System.out.println("Element is found at the index :"+search(a,5));
		int r=search(a,6);
		if(r==-1)
		{
			System.out.println("Element is not found");
		}
	}
	public static int search(int []a, int s)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				return i;
			}
		}
		return -1;
	}
}
