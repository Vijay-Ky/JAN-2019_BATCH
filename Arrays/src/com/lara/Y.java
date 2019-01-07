package com.lara;
import java.util.Arrays;
public class Y
{
	public static void main(String []args)
	{
		String x[]={"hello","blue","yello","white","pink","lara","java"};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int i=Arrays.binarySearch(x,"abc");
		System.out.println("abc:"+i);
		i=Arrays.binarySearch(x,"orange");
		System.out.println("orange:"+i);
		i=Arrays.binarySearch(x,"red");
		System.out.println("red"+i);
	}
}