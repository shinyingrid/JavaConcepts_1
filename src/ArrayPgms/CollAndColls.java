package ArrayPgms;
import java.io.*;
import java.security.PublicKey;
import java.util.*;


public class CollAndColls {

	public static void main(String[] args)
	{
		//creating an object for List<String>
		List<String> list1 = new ArrayList<>();
		
		//add() - adding an element in the collection
		list1.add("Shiny");
		list1.add("Ingrid");
		list1.add("Anoukhi");
		list1.add("Ayaan");
		System.out.println(list1);
		
		 //creating another object
		 List<String> list2 = new ArrayList<>();
		 list2.add("Mango");
		 list2.add("Orange");
		 list2.add("Apple");
		 
		 //boolean returns true if the addition is successful
		 //addAll() - to insert the specified collection elements to the invoking collection
		 boolean newList =list1.addAll(list2);
		 System.out.println(newList);
		
		System.out.println(list1);
		
		//remove() - removes a specific element
		list1.remove("Mango");
		System.out.println(list1);
		
		//removeAll() - to remove a collection from the invoking collection
		list1.removeAll(list2);
		System.out.println(list1);
		
		//Adding elements directly to a list
		Collections.addAll(list1,"Hello", "Hi");
		System.out.println(list1);
		 
		//sort() - sorts according to natural ordering of elements
		 Collections.sort(list1);
		 System.out.println(list1);
		 
		//reverse()- reverses the list
		 Collections.reverse(list1);
		 System.out.println(list1);
		 
		 //creating the third object
		List<String> list3 = new ArrayList<>();
		list3.add("bike");
		list3.add("car");
		list3.add("train");
		
		//adding the elements of collection list3 to collection list1
		list1.addAll(list3);
		System.out.println(list1);
		 
		//retainAll() - remove invoking collection elements except the specified collection
		list1.retainAll(list3);
		System.out.println(list1);
		
		//size() - returns the number of elements
		int noOfElements=list1.size();
		System.out.println(noOfElements);
		
		//contains() - to find whether the element is present in the specific collection
		boolean isItAvailable= list1.contains("bike");
		System.out.println(isItAvailable);
		boolean isItAvailable1=list2.contains("Mango");
		System.out.println(isItAvailable1);
		
		//containsAll() - to find whether the specified collection is present in the invoking collection
		boolean availableInCollection = list1.containsAll(list3);
		System.out.println(availableInCollection);
		
		//isEmpty()- to check whether the collection is Empty
		boolean isItEmpty= list1.isEmpty();
		System.out.println(isItEmpty);
		
		//equals() - matches two collections regardless of the order and checks if the values are equal
		boolean areTheyEqual= list1.equals(list2);
		System.out.println(areTheyEqual);
		boolean areTheyEqual1= list1.equals(list3);
		System.out.println(areTheyEqual1);
		
		//hashCode() - returns the hashcode number for collection
		int hash = list1.hashCode();
		System.out.println(hash);
		
		//clear() - removes all the elements from the collection
		list1.clear();
		System.out.println(list1);
		
		List<String> list4=new ArrayList<>();
		list4.add("Bangalore");
		list4.add("Chennai");
		list4.add("Madurai");
		System.out.println(list4);
		
		//toArray() - converting collection into ArrayList
		//obj[].toArray()
		String[] stringArray = list4.toArray(new String[0]);
		for(String place : stringArray)
		{
		System.out.println(place);
		}
	}

}
