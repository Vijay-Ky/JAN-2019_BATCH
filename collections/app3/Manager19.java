package com.app3;

import java.util.HashSet;

class E
{
	int i;
	
	E(int i)
	{
		this.i = i;
	}

	@Override
	public String toString()
	{
		return "i = " + i;
	}

	@Override
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		E e1 = (E) obj;
		return i == e1.i;
	}
}


public class Manager19
{

	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(new E(9));
		set.add(new E(9));
		set.add(new E(90));
		set.add(new E(90));
		set.add(new E(5));
		set.add(new E(5));
		System.out.println(set);
		
	}

}
