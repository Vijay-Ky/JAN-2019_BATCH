package com.app1;

import java.util.ArrayList;

public class Manager15
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(90);

		list.add(80);
		
		list.add(60);
		
		list.add(20);
		
		System.out.println(list);
		
		list.set(2, "abc");
		
		System.out.println(list);

	}

}
