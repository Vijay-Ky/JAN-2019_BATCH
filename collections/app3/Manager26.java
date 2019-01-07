package com.app3;

import java.util.Collections;
import java.util.TreeSet;

public class Manager26
{

	public static void main(String[] args)
	{
		TreeSet set1 = new TreeSet(Collections.reverseOrder());
		set1.add(9.9);
		set1.add(0.9);
		set1.add(9.4);
		set1.add(4.5);
		set1.add(5.6);
		set1.add(8.5);
		set1.add(0.5);
		set1.add(1.5);
		System.out.println(set1);
	}

}
