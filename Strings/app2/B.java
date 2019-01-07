package com.app2;

public class B
{

	public static void main(String[] args)
	{
		String s1 = "abc 123 xyz";
		int i = s1.indexOf("123");
		System.out.println(i);
		
		int j = s1.indexOf("xy");
		System.out.println(j);
		
		int k = s1.indexOf("bc");
		System.out.println(k);
		
		int m = s1.indexOf("yza");
		System.out.println(m);
	}

}
