package com.lara;
class B
{
	int i; 
}
public class Manager2
{
	public static void main(String[] args)
	{
		B b1= new B();
		b1.i=10;
		String s1= b1.toString();
		System.out.println(s1);
		System.out.println(b1);
	}
}