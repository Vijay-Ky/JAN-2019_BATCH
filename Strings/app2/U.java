package com.app2;

public class U
{

	public static void main(String[] args)
	{
		String s1 = "abc xyz hello abc";
		
		String s2 = s1.replaceAll("abc", "test");
		
		System.out.println(s1);

		System.out.println(s2);
	}

}
