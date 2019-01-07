package com.lara;
class F
{
	int i;
	public String toString()
	{
		return "i="+i;
	}
}
public class Manager6
{
	public static void main(String[] args)
	{
		F f1= new F();
		f1.i= 10;
		System.out.println(f1);
	}
}