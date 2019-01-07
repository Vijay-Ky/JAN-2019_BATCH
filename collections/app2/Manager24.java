package com.app2;

import java.util.ArrayList;
import java.util.Collections;

class D implements Comparable<Object>
{
	int i;

	D(int i)
	{
		this.i = i;
	}
	
	@Override
	public String toString()
	{
		return "i = " + i;
	}

	@Override
	public int compareTo(Object obj)
	{
		return i - ( (D) obj).i;
	}
}

public class Manager24
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		
		list.add(new D(9));
		
		list.add(new D(0));
		
		list.add(new D(8));
		
		list.add(new D(2));

		list.add(new D(5));

		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
