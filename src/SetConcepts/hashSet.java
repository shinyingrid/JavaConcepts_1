package SetConcepts;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) 
	{
		// HashSet-Is is a class Uses a hash table to store elements.
		//It provides constant-time performance for basic operations (add, remove, contains), assuming a good hash function is used
		
		 HashSet hash = new HashSet<>();
		 hash.add("Rajni");
		 hash.add("Kamal");
		 hash.add("Karthik");
		 hash.add("Kamal"); // duplicates are ignored
		 System.out.println(hash);
		
		
	}

}
