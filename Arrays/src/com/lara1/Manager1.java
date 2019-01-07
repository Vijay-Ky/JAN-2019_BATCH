package com.lara1;
import java.util.Arrays;
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
}
public class Manager1
{
	public static void main(String []args)
	{
		A x[]=new A[2];
		x[0]=new A(90);
		x[1]=new A(90);
		System.out.println(x);
		System.out.println(Arrays.toString(x));
	}
}