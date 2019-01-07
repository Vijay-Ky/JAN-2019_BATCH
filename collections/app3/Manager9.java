package com.app3;

import java.util.PriorityQueue;

public class Manager9
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("abc");
		
		pq.add("done");
		
		pq.add(10);
		
		pq.add("xyz");
		
		pq.add("test");
		
		System.out.println(pq);
		
	}

}
