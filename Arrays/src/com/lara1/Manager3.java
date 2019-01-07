package com.lara1;
import java.util.Arrays;
class C
{
	int i;
	C(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return "i="+i;
	}
}
public class Manager3
{
	public static void main(String []args)
	{
		C x[]=new C[4];
		x[0]=new C(9);
		x[1]=new C(5);
		x[2]=new C(7);
		x[3]=new C(4);
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}