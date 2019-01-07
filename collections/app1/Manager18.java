package com.app1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager18
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		
		list.add(9);
		
		list.add(19);
		
		list.add(91);
		
		list.add(29);
		
		list.add(2);
		
		list.add(25);
		
		System.out.println(list);
		
		@SuppressWarnings("rawtypes")
		Comparator ctr =Collections.reverseOrder();
		
		Collections.sort(list, ctr);
		
		System.out.println(list);

	}

}
