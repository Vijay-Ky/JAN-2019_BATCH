package com.lara;
import java.util.Arrays;
public class U
{
	public static void main(String []args)
	{
		String x[]={"xyz","test","hello","abc","done"};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}