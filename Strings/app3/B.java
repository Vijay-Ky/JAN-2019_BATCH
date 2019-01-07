package com.app3;

public class B
{

	public static void main(String[] args)
	{
		String s1 = "java";

		String s2 = "ja";

		String s3 = "va";

		String s4 = s2 + s3;
		
		System.out.println(s1 == s4);
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1.hashCode());
		
		System.out.println(s4.hashCode());

	}

}
