package com.app1;

import java.util.ArrayList;

public class Manager9
{

	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		
		list1.add(9);
		
		list1.add(0);
		
		list1.add(4);
		
		list1.add(6);
		
		list1.add(8);
		
		list1.add(2);
		
		list1.add(1);
		
		list1.add(3);
		
		System.out.println(list1);

		Object obj = list1.remove(3);
		
		System.out.println(list1);
		
		System.out.println(obj);
		
		obj = list1.remove(10);
		
		System.out.println(obj);
	}

}
