package SetConcepts;
import java.util.LinkedHashSet;
public class linkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("sa");
		lhs.add("re");
		lhs.add("ga");
		lhs.add("ma");
		System.out.println(lhs); //insertion order is maintained
		
		lhs.remove("ga");
		System.out.println(lhs);
		
		lhs.add("ma");
		System.out.println(lhs); //duplicates not allowed
		

	}

}
