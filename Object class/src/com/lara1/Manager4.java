package com.lara;
class H
{
	int x;
	H(int x)
	{
		this.x=x;
	}
	public boolean equals(Object obj)
	{
		return(obj instanceof H &&
				x==((H)obj).x);
		
	}
}
class I
{
	int x;
	I(int x)
	{
		this.x=x;
	}
	public boolean equals(Object obj)
	{
		return(obj instanceof I && 
				x==((I)obj).x);
		
	}
}
public class Manager4
{
	public static void main(String[] args)
	{
		H h1=new H(90);
		H h2=new H(90);
		I obj1=new I(100);
		I obj2=new I(100);
		System.out.println(h1.equals(h2));
		System.out.println(obj1.equals(obj2));
		System.out.println("--------");
		System.out.println(obj1.equals(h2));
		System.out.println(h1.equals(obj2));
		System.out.println("--------");
		
	}
}