package SetConcepts;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet<>();
		ts.add("banana");
		ts.add("apple");
		ts.add("grapes");
		System.out.println(ts); // displays in the natural order 
		
		ts.add("cane");
		ts.add("apple"); // duplicates are not allowed
		System.out.println(ts); 
	}

}
