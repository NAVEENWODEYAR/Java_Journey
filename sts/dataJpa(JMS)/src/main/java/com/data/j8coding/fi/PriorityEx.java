package com.data.j8coding.fi;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityEx {

	public static void main(String[] args) 
	{
//		PriorityQueue<Integer> pq = new PriorityQueue<>();		// default it has Min PQ
//								pq.add(10);
//								pq.offer(7);
//								pq.add(3);
//								pq.add(5);
//								pq.offer(9);
// 								System.out.println(pq.peek());
// 								System.out.println(pq);
// 								System.out.println(pq.poll());
// 								System.out.println(pq);
// 								System.out.println(pq.element());
// 								System.out.println(pq);
// 								
 								
 								PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());		// Max PQ
								pq.add(10);
								pq.offer(7);
								pq.add(3);
								pq.add(5);
								pq.offer(9);
 								System.out.println(pq.peek());
 								System.out.println(pq);
 								System.out.println(pq.poll());
 								System.out.println(pq);
 								System.out.println(pq.element());
 								System.out.println(pq);

	}

}
