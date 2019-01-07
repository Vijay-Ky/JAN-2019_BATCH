package com.app2;

import java.util.ArrayList;
import java.util.Collections;

class C
{
	int i;

	C(int i)
	{
		this.i = i;
	}	
	@Override
	public String toString()
	{
		return "i = " + i;
	}

}

public class Manager23
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new C(9));
		
		list.add(new C(19));
		
		list.add(new C(4));
		
		list.add(new C(10));

		list.add(new C(8));

		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
