package QueueConcepts;

import java.util.LinkedList;
import java.util.Queue;

public class queueBasic {

	public static void main(String[] args) 
	{
		//Create a queue using LinkedList
		Queue<String> que = new LinkedList<>();
		
		//Enqueue - add elements to the queue
		que.add("java");
		que.add("sql");
		que.add("testing");
		System.out.println(que); //order maintained
		
		//poll()- retrieves and removes the first element in queue
		//que.poll; removes the first element in the queue FIFO
		String removedElement = que.poll(); // store in a string obj if you want to know the element removed
		System.out.println(removedElement);
		
		//offer() - adds ele to the end of queue FIFO
		que.offer(removedElement); //any element can be added
		System.out.println(que);
		
		//retrieves the first element but does not remove it
		String firstelement = que.peek(); //FIFO
		System.out.println(firstelement);
		

	}

}
