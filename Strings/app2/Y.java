package com.app2;

public class Y
{

	public static void main(String[] args)
	{
		String s1 = "abc";
		
		String s2 = "abc";
		
		String s3 = new String("abc");
		
		String s4 = new String("abc");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s1));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
