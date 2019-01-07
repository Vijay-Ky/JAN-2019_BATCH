package com.app3;

import java.util.TreeSet;

class J
{
	int x;
	J(int x)
	{
		this.x = x;
	}
	
	@Override
	public String toString()
	{
		return "x = " + x;
	}

}

public class Manager27
{

	public static void main(String[] args)
	{
		TreeSet set = new TreeSet();
		set.add(new J(10));
		set.add(new J(20));
		set.add(new J(30));
		set.add(new J(40));
		set.add(new J(50));
		System.out.println(set);
	}

}
