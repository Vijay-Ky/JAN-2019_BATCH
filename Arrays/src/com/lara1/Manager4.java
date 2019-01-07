package com.lara1;
import java.util.Arrays;
class D implements Comparable //available in java.lang package
//comparable provide one method that is compareTo()
{
	int i;
	D(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
	public int compareTo(Object obj)
	{
		D d1=(D)obj;
		return i-d1.i;
	}
}
public class Manager4
{
	public static void main(String []args)
	{
		D[]x={new D(9),new D(90),new D(19), new D(29),
		new D(13),new D(33)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}