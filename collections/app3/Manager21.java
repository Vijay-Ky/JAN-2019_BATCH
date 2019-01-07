package com.app3;

import java.util.HashSet;

class G
{
	int i, j;

	G(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	@Override
	public int hashCode()
	{
		System.out.println("hashCode");
		String s1 = Integer.toString(i);
		String s2 = Integer.toString(j);
		int i = s1.hashCode();
		i += s2.hashCode();
		return i;
	}

	@Override
	public boolean equals(Object obj)
	{
		System.out.println("equals");
		return (i == ((G)obj).i && j == ((G)obj).j);
	}	
}

public class Manager21
{

	public static void main(String[] args)
	{
		HashSet list = new HashSet();
		list.add(new G(1, 1));
		list.add(new G(1, 1));
		list.add(new G(2, 1));
		list.add(new G(1, 2));
		System.out.println(list.size());
	}

}
