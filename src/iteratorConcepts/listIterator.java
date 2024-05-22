package iteratorConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) 
	{
		List<String> colors = new ArrayList<>();
		colors.add("Black");
		colors.add("Red");
		colors.add("white");
		System.out.println(colors);
		
		ListIterator<String> iterator = colors.listIterator();
		
		//Iterator interface has 5 methods:
		//1. hasNext() 2. next() 3.hasPrevious() 4.previous() 5.remove()
		
		//Forward Iteration
		System.out.println("Forward Iteration");
		while (iterator.hasNext())  // public boolean hasNext(); - whether next element is present or not
		{
			System.out.println(iterator.next());   //public Object next(); - return the next element
		}
		
		//public void remove() - removes the last element returned by the iterator
		iterator.remove();
		System.out.println(colors);
		
		//Backward Iteration
		System.out.println("Backward Iteration");  
		while(iterator.hasPrevious()) //public boolean hasPrevious(); - whether previous element is present or not
		{
			System.out.println(iterator.previous()); //public Object previous() -returns the previous element 
		}
		
		
		
		
}
}