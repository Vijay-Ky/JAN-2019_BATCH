package com.app2;

public class Z
{

	public static void main(String[] args)
	{
		String s1 = "java";

		String s2 = "ja" + "va";
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
