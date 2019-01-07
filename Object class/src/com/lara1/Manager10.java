package com.lara;
class S
{
	int i;
}
public class Manager10
{
	public static void main(String[] args)
	{
		S s1= new S();
		S s2= new S();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}