package com.lara;
public class Q
{
	public static void main(String []args)
	{
		test(new int[]{10,2});
	}
	static void test(int x[])
	{
		System.out.println(x.length);
		for(int i:x)
		{
			System.out.println(i);	
		}
	}	
}
	