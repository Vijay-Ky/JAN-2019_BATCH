package com.lara1;
import java.util.Arrays;
public class Manager5
{
	public static void main(String []args)
	{
		int x[]={10,30,15,40,20};
		Integer[]y={new Integer(9),19,20,new Integer(15)};
		String[]z={"xyz",new String("abc"),"lara","java"};
		//D[]p ={new D(9),new D(19),new D(29), new D(15),new D(5)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println("---------");
		System.out.println(Arrays.toString(y));
		Arrays.sort(y);
		System.out.println(Arrays.toString(y));
		System.out.println("---------");
		System.out.println(Arrays.toString(z));
		Arrays.sort(z);
		System.out.println(Arrays.toString(z));
		System.out.println("---------");
		//System.out.println(Arrays.toString(p));
		//Arrays.sort(p);
		//System.out.println(Arrays.toString(p));
		System.out.println("---------");
	}
}