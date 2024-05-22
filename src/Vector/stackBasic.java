package Vector;

import java.util.Stack;

public class stackBasic {

	public static void main(String[] args)
	{
		//creating a stack
		Stack s=new Stack<>();
		s.add("Kerala");
		s.add("TamilNadu");
		s.add("karnataka");
		System.out.println(s);
		s.remove("TamilNadu");
		System.out.println(s);
		
		Stack s1 = new Stack<>();
		s1.push("Malayalam");
		s1.push("Tamil");
		s1.push("Kannada");
		System.out.println(s1);
		
		//pop() - removing the last element -LIFO
		s1.pop();
		System.out.println(s1);
		
		//peek() - peeking at the top most element of the stack (last stacked element)
		Object element = s1.peek();
		System.out.println(element);

	}

}
