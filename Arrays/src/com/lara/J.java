package com.lara;
public class J
{
	public static void main(String []args)
	{
		int[]x=new int[2];
		int[]y=x;
		x[0]=10;
		y[1]=20;
		System.out.println(x[1]);
		System.out.println(y[0]);
		}
}
