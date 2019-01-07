package com.app3;

import java.util.PriorityQueue;

public class Manager10
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue queue = new PriorityQueue();
		
		queue.add(12);
		
		queue.add(null);
		
		queue.add(4);
		
		System.out.println(queue);
	}

}
