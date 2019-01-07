package com.app3;

import java.util.LinkedList;

public class Manager4
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(100);
		list.add(20);
		list.add(40);
		
		System.out.println(list);
		
		System.out.println(list.peek());

		System.out.println(list);
		
		System.out.println(list.poll());
		
		System.out.println(list);
	}

}
