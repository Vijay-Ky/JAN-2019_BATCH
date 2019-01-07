package com.lara;
public class K
{
	public static void main(String []args)
	{
		int[]x=new int[2];
		x[0]=10;
		test1(x);
		System.out.println(x[0]);
		test2(x[0]);
		System.out.println(x[0]);
	}	
	static void test1(int[]y)
	{
		y[0]=20;
	}
	static void test2(int z)
	{
		System.out.println(z);
		z=30;
	}
}
