package com.lara;
public class L
{
	public static void main(String []args)
	{
		int[]x=new int[2];
		int[]y=new int[3];
		x=y;
		y=x;
		System.out.println("done");
	}
}
