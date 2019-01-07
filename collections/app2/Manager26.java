package com.app2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class F
{
	int i, j;

	F(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString()
	{
		return "(" + i +"," + j + ")";
	}	
}

class G implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2)
	{
		F f1 = (F) o1;

		F f2 = (F) o2;
		
		return f1.i - f2.i;
	}	
}

class H implements Comparator<Object>
{
	
	@Override
	public int compare(Object o1, Object o2)
	{
		F f1 = (F) o1;
		
		F f2 = (F) o2;
		
		return f1.j - f2.j;
	}	
}

public class Manager26
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)
	{
		@SuppressWarnings("unchecked")
		ArrayList<F> list = new ArrayList();
		
		list.add(new F(1, 0));
		
		list.add(new F(6, 2));
		
		list.add(new F(0, 8));
		
		list.add(new F(2, 5));
		
		list.add(new F(5, 1));
	
		System.out.println(list);
		
		Collections.sort(list, new G());
		
		System.out.println(list);
		
		Collections.sort(list, new H());
		
		System.out.println(list);
	}

}
