package com.app3;

import java.util.PriorityQueue;

public class Manager8
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(9);
		pq.add(91);
		pq.add(19);
		pq.add(92);
		pq.add(29);
		pq.add(93);
		pq.add(39);
		pq.add(3);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
	}

}
