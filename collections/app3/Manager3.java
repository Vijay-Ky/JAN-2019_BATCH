package com.app3;

import java.util.LinkedList;

public class Manager3
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		
		list.add(90);
		list.add(70);
		list.add(910);
		list.add(190);
		list.add(50);
		list.add(70);
		
		System.out.println(list);
		
		Object obj = list.poll();
		
		System.out.println(obj);
		
		System.out.println(list);
		
		Object obj1 = list.poll();
		
		System.out.println(obj1);
		
		System.out.println(list);

	}

}
