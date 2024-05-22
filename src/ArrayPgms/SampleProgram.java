package ArrayPgms;

public class SampleProgram 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		
		//First way of printing the array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//Second way of printing elements of an array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);//1 2 3 4 5
		}
		
		//Third way of printing elements
		for(int e : a)
		{
			System.out.println(e);
		}
		
	}
	
}
