package com.app2;

public class F
{

	public static void main(String[] args)
	{
		String s1 = "abababab";
		
		int i = s1.indexOf('b');
		int j = s1.indexOf('a', 3);
		int k = s1.lastIndexOf('b');
		int m = s1.lastIndexOf('a');
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}

}
//a b a b a b a b 
//0 1 2 3 4 5 6 7