package Enumeration;
enum Day {SUNDAY,MONDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}

public class enumBasic 
{
	//Enumerations are commonly used when you have a set of related, constant values that are expected to remain fixed throughout the life of your program.
	public static void main(String[] args) 
	{
		Day today = Day.WEDNESDAY;
		
		switch (today)
			{
		case MONDAY:
		{
			System.out.println("Monday is a working day");
		}
		case FRIDAY:
		{
			System.out.println("Friday is a fun day");
		}
		default:
		{
			System.out.println("Yet another day");
		}
				}
		
		
	}
}
