package com.app2;

import java.util.ArrayList;
import java.util.ListIterator;

public class Manager39
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(90);
		
		list.add(9);
		
		list.add(0);
		
		list.add(40);
		
		ListIterator it = list.listIterator();
		
		list.add(50);
		
		while (it.hasNext())
		{
			System.out.print(it.next() + ", ");
		}
		
		System.out.println();
		
		while (it.hasPrevious())
		{
			System.out.print(it.previous() + ", ");
			
		}		
	}
}

