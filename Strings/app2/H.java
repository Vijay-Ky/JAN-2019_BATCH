package com.app2;

public class H
{
	public static void main(String[] args)
	{
		String s1 = "abc abc abc abc";
		
		int i = s1.lastIndexOf("abc");
		System.out.println(i);

		int j = s1.lastIndexOf("abc", 5);
		System.out.println(j);
		
		int k = s1.lastIndexOf("abc", 9);
		System.out.println(k);
	}
}
