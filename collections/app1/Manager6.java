package com.app1;

import java.util.ArrayList;

public class Manager6
{

	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		
		list1.add(9);
		
		list1.add(0);
		
		list1.add(90);
		
		list1.add(19);
		
		System.out.println(list1);
		
		ArrayList list2 = new ArrayList();
		
		list2.add(100);
		
		list2.add(50);
		
		list2.addAll(list1);
		
		System.out.println(list1);

		System.out.println(list2);
		

	}

}
