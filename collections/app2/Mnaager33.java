package com.app2;

import java.util.ArrayList;
import java.util.Iterator;

public class Mnaager33
{

	public static void main(String[] args)
	{
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(90);
		
		list.add(9);
		
		list.add(0);
		
		list.add(40);
		
		Iterator<Object> it = list.iterator();
		
		while (it.hasNext())
		{
			Object obj = it.next();
			
			System.out.println(obj);
			
			if (obj.equals(9))
			{
				it.remove();
			}
		}		
		System.out.println(list);		
	}
}

