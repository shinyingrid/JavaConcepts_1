package LinkedListConcepts;

import java.util.LinkedList;

public class linkedListMethods {

	public static void main(String[] args)
	{
		// Create a LinkedList
		LinkedList ll = new LinkedList<>();
		
		//Add elements
		ll.add("earth");
		ll.add("venus");
		
		//adding to first and last index
		ll.addFirst("sun");
		ll.addLast("moon");
		System.out.println(ll);
		
		//index begins from 0
		ll.add(2, "mercury");
		System.out.println(ll);
		
		
		//Creating another list
		 LinkedList ll2 = new LinkedList<>();
		 ll2.add("summer");
		 ll2.add("winter");
		 ll2.add("autumn");
		 ll2.add("Spring");
		 System.out.println(ll2);
		 
		 //adding a Collection to a particular index
		 ll.add(3,ll2);
		 System.out.println(ll);
		 
		 //adding a collection to the invoking collection
		 ll.addAll(ll2);
		 System.out.println(ll);
		

	}

}
