package com.app2;

public class D
{

	public static void main(String[] args)
	{
		String s1 = "abc abc abc";
		
		int i = s1.indexOf("abc");
		System.out.println(i);
		
		int j = s1.indexOf("abc", 2);
		System.out.println(j);
		
		int k = s1.indexOf("abc", 6);
		System.out.println(k);
		
	}

}
