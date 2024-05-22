package QueueConcepts;

import java.nio.channels.NonReadableChannelException;
import java.util.PriorityQueue;

public class priorityQueue {

	public static void main(String[] args)
	{
		//create a priority queue 
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		
		//add elements
		pQueue.add(5);
		pQueue.add(10);
		pQueue.add(15);
		pQueue.add(20);
		System.out.println(pQueue);
		
		//removing all elements from queue one by one and display each time
		while(!pQueue.isEmpty())
		{
			int remove=pQueue.poll();
			System.out.println("Removed element is :"+remove); //loops through the entire queue
		}
		
		System.out.println(pQueue); // queue is empty now
		
		while(pQueue.isEmpty())
		{
			pQueue.offer(100);
			pQueue.offer(200);
			pQueue.offer(300);
			
		}
		System.out.println(pQueue);
		
		//reverse priority queue using custom comparator
		PriorityQueue<Integer> revPriorityQueue = new PriorityQueue<>((a,b)->b-a);
		revPriorityQueue.add(1000);
		revPriorityQueue.add(2000);
		revPriorityQueue.add(3000);
		System.out.println(revPriorityQueue); // [3000,1000,2000]
		
		
		
	}

}
