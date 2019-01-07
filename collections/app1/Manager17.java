package com.app1;

import java.util.ArrayList;
import java.util.Collections;

public class Manager17
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(9);
		list.add(19);
		list.add(91);
		list.add(29);
		list.add(2);
		list.add(25);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
