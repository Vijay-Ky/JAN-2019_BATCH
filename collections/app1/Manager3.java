package com.app1;

import java.util.ArrayList;

public class Manager3
{

	public static void main(String[] args)
	{
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		
		list.add(90);
		
		list.add("abc");
		
		list.add(90.9);
		
		list.add(true);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}

	}

}
