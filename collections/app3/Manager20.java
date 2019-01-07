package com.app3;

import java.util.HashSet;

class F
{
	int i, j;

	public F(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString()
	{
		return "(" + i + "," + j + ")";
	}

	@Override
	public int hashCode()
	{
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof F && i == ((F)obj).i && j == ((F)obj).j );
	}	
}

public class Manager20
{

	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(new F(1, 2));
		set.add(new F(1, 2));
		set.add(new F(2,1));
		set.add(new F(2, 1));
		System.out.println(set);
	}

}
