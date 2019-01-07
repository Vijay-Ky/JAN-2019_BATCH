package com.app3;

import java.util.HashSet;
import java.util.TreeSet;

public class Manager24
{

	public static void main(String[] args)
	{
		HashSet set = new HashSet();
		set.add(90);
		set.add(0);
		set.add(9);
		set.add(19);
		set.add(6);
		set.add(18);
		System.out.println(set);
		TreeSet set1 = new TreeSet(set);
		System.out.println(set1);
		
	}

}
