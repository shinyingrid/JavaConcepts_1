package Vector;

import java.util.Vector;

import javax.crypto.BadPaddingException;

public class vectorBasic {

	public static void main(String[] args) 
	{
		// Create a vector
		Vector v = new Vector<>();
		
		//adding elements
		v.add("hi");
		v.add("hello");
		System.out.println(v);
		
		//adding to a specific index - index begins at 0
		v.add(1, "add");
		System.out.println(v);
		
		Vector v1 = new Vector<>();
		v1.add("Ruby");
		v1.add("crystal");
		
		// adding a collection to the invoking collection
		v.addAll(2,v1);
		System.out.println(v);
		
	}

}
