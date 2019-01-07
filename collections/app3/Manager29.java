package com.app3;

import java.util.Comparator;
import java.util.TreeSet;

class L
{
	int i, j;

	L(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString()
	{
		return "(" + i + "," + j + ")";
	}
	
	static class A implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2)
		{
			L obj1 = (L) o1;
			L obj2 = (L) o2;
			return obj1.i - obj2.i;
		}
	}
	static class B implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2)
		{
			L obj1 = (L) o1;
			L obj2 = (L) o2;
			return obj1.j - obj2.j;
		}
	}
}

public class Manager29
{
	public static void main(String[] args)
	{
		TreeSet set1 = new TreeSet(new L.A());
		TreeSet set2 = new TreeSet(new L.B());
		set1.add(new L(1, 0));
		set1.add(new L(2, 1));
		set1.add(new L(0, 4));
		set1.add(new L(5, 2));
		set1.add(new L(4, 3));
		System.out.println(set1);
		
		set2.add(new L(1, 0));
		set2.add(new L(2, 1));
		set2.add(new L(0, 4));
		set2.add(new L(5, 2));
		set2.add(new L(4, 3));
		System.out.println(set2);
	}

}
