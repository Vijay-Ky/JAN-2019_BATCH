package com.app2;

public class N
{

	public static void main(String[] args)
	{
		String s1 = "abc xyz hello 123";
		
		String[] x = s1.split(" ");
		
		for (String s2 : x)
		{
			System.out.println(s2);
		}
	}

}
