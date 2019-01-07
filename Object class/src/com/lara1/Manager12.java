package com.lara;
class U
{
	int i;
	public int hashCode()
	{
		return i;
	}
}
public class Manager12
{
	public static void main(String[] args)
	{
		U u1= new U();
		u1.i= 10;
		U u2= new U();
		u2.i= 20;
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}