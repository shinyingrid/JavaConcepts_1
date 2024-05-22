package ArrayPgms;

import java.util.ArrayList;
import java.util.List;

public class convertCollToArray {

	public static void main(String[] args) 
	{
		// Create a Collection
		//ArrayList music = new ArrayList<>(); this also works similar to List<String> return type
		List<String> music=new ArrayList<>();
		music.add("violin");
		music.add("Guitar");
		music.add("keyboard");
		System.out.println(music);
		
		//convert collection to arrayList
		String[] musicArray=music.toArray( new String[0]);
		//System.out.println(musicArray); gives the address
		for(String s: musicArray)
		{
			System.out.println(s);
		}

	}

}
