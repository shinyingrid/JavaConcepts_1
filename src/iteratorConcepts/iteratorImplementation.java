package iteratorConcepts;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class iteratorImplementation {

	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("sa");
		lhs.add("re");
		lhs.add("ga");
		lhs.add("ma");
		System.out.println(lhs); //insertion order is maintained
		
		//creating an iterator for this set lhs
		Iterator lhsIterator=lhs.iterator();
		while(lhsIterator.hasNext())
		{
			System.out.println(lhsIterator.next()); //displays in a list rather than collection
			
		}
		
		if(lhs.contains("ma"))
		{
			System.out.println("ma is present");
		}
		else
		{
			System.out.println("ma is missing");
		}
		
		for (String s: lhs)
		{
			System.out.println(s);
		}

	}

}
