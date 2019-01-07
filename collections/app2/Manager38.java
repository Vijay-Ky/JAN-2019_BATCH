package com.app2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager38
{

	public static void main(String[] args)
	{
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(90);
		
		list.add(9);
		
		list.add(0);
		
		list.add(40);
		
		ListIterator<Object> it = list.listIterator();
		
		while (it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		
		list.add(50);
		
		System.out.println();
		
		System.out.println("-------");
	}
}

