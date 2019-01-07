package com.app2;

public class G
{

	public static void main(String[] args)
	{
		String s1 = "ab ab ab ab";
		
		int i = s1.lastIndexOf('b', 5);
		System.out.println(i);
		
		int j = s1.lastIndexOf('a', 7);
		System.out.println(j);
	}

}
