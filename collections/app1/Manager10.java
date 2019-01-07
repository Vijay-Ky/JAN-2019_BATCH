package com.app1;

import java.util.ArrayList;

public class Manager10
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
		
		boolean flag = list1.remove(new Integer(2));
		
		System.out.println(list1);
		
		System.out.println(flag);
		
		flag = list1.remove(new Integer(12));
		
		System.out.println(flag);

	}

}
