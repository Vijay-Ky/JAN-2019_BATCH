package com.app1;

import java.util.ArrayList;

public class Manager1
{

	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		
		list.add(90);
	
		list.add(9.9);
		
		list.add("abc");
		
		list.add(true);
		
		System.out.println(list);
		
		
		
		
		

	}

}
