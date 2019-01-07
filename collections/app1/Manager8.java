package com.app1;

import java.util.ArrayList;

public class Manager8
{

	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		
		list1.add(90);
		
		list1.add(0);
		
		list1.add(9);
		
		list1.add(4);
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList(list1);
		
		list2.add("abc");
		
		System.out.println(list2);

	}

}
