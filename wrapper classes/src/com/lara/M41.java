package com.lara;
public class M41
{
	static void test()
	{
		System.out.println("test()");
	}
	static void test(int...arg)
	{
		System.out.println("test(var-args)");
	}
	public static void main(String [] args)
	{
		test();
		test(10);
		test(10,30);
		test(40,50,90);
		test(8,240,150,910);
	}
}
