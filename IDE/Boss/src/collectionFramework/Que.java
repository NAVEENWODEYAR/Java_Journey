package collectionFramework;

import java.util.*;
public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue();
			for(int i=10; i>0; i--)
			{
				pq.add(i);
			}
		System.out.println(pq);
			System.out.println(pq.size());			// returns the size of the queue
			System.out.println(pq.peek());
				pq.remove();
			System.out.println(pq.poll());
			System.out.println(pq.size());
		
	}

}
