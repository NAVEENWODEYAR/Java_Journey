package queue;

import java.util.*;
public class PriorityQ {

	public static void main(String[] args) {
		// PriorityQueue doesn't allow heterogeneous elements
		PriorityQueue pq = new PriorityQueue();
						pq.add(1);
						pq.offer(2);
						pq.offer(5);
						pq.offer(3);
						pq.offer(7);
						pq.offer(4);
						pq.offer(8);
						pq.offer(1);
						System.out.println(pq);
						
					System.out.println(pq.poll());
					System.out.println(pq);
					
					System.out.println(pq.peek());
					System.out.println(pq);	
		

	}

}
