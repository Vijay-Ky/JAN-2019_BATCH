package com.app3;

import java.util.LinkedList;

class Stack
{
	@SuppressWarnings("rawtypes")
	private LinkedList list = new LinkedList();
	
	@SuppressWarnings("unchecked")
	public void add(Object obj)
	{
		list.add(obj);
	}

	public Object processElement()
	{
		return list.removeLast();
	}

	@Override
	public String toString()
	{
		return list.toString();
	}
}

public class Manager7
{

	public static void main(String[] args)
	{
		Stack s1 = new Stack();
		
		s1.add(90);
		
		s1.add("abc");
		
		s1.add(900);
		
		s1.add("xyz");
		
		s1.add("done");
		
		System.out.println(s1);
		
		Object o1 = s1.processElement();
		
		System.out.println(o1);
		
		System.out.println(s1);
		
		Object o2 = s1.processElement();
		
		System.out.println(s1);
		
		System.out.println(o2);

	}

}
