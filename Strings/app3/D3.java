package com.app3;

public class D3
{

	public static void main(String[] args)
	{
		String s1 = "abc hello";
		
		char[] x = s1.toCharArray();// convert string obj into character array & we can read the content one by one
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i] + ", ");
		}
	}

}
