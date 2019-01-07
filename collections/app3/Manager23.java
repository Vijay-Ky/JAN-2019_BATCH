package com.app3;

import java.util.HashSet;
import java.util.Iterator;

public class Manager23
{

	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(123);
		set.add("abc");
		set.add("xyz");
		set.add(123);
		set.add(true);
		set.add('a');
		System.out.println(set);
		
		Iterator it = set.iterator();
		System.out.println("------");
		while (it.hasNext())
		{
			System.out.print(it.next() + ",");;
			
		}
	}

}
