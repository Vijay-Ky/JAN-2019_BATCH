package com.app1;

import java.util.ArrayList;

public class Manager2
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		ArrayList<Comparable> list1 = new ArrayList<Comparable>();
		
		list1.add(90);
		
		list1.add(true);
		
		int i = (Integer) list1.get(0);
		
		boolean flag = (Boolean) list1.get(1);
		
		System.out.println(i);
		
		System.out.println(flag);

	}

}
