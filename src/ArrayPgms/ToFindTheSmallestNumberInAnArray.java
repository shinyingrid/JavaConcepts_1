package ArrayPgms;

public class ToFindTheSmallestNumberInAnArray
{
	public static void main(String[] args)
	{
		int[] arr= {5,6,2,4,3,1,8};
		
		int smallest = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
			}
		}
		System.out.println("Smallest number is: "+smallest);
	}
}
