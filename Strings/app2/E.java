package com.app2;

public class E
{

	public static void main(String[] args)
	{
		String s1 = "abc hello abc";
		
		int i = s1.lastIndexOf('b');
		System.out.println(i);
		
		int j = s1.lastIndexOf('l');
		System.out.println(j);
		
		int k = s1.lastIndexOf('a');
		System.out.println(k);
	}

}
//abc hello abc
//0123456789111