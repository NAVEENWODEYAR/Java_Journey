package cF1;

import java.util.*;
public class Quee {

	public static void main(String[] args) {
		// Queue interface maintains the first-in-first-out order
		PriorityQueue pq = new PriorityQueue();
		System.out.println("Priority queue doesn't allows the null values.");
			pq.add(1);
			pq.add(10);
			pq.add(3);
			pq.add(9);
			pq.add(2);
		System.out.println(pq);
			pq.poll();									// poll() - removes the head element from the queue.
			System.out.println("Queue after the poll() "+pq);
			System.out.println(pq.peek());
		// Iterating the queue
			Iterator it = pq.iterator();
				while(it.hasNext())
				{
					System.out.println("Elements of the queue: "+it.next());
				}
	}

}
