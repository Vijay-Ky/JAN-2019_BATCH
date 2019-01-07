package com.app1;

public class K
{

	public static void main(String[] args)
	{
		String s1 = "null";
		String s2 = null;
		String s3 = s1 + null;
		String s4 = s2 + null;
		System.out.println(s3.equals(s4));
	}

}
