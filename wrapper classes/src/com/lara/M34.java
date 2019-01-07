package com.lara;
public class M34
{
	static int test()
	{
		Integer obj=new Integer(20);
		return obj;//return obj.intValue();
	}
	public static void main(String [] args)
	{
		Integer o1=test();
		//new integer(test());
		System.out.println("done");
	}
}
