package com.lara;
class D
{
	int i;
	public boolean equals(Object obj)
	{
		D d=(D)obj;
		return i==d.i;
	}
}
class E
{
	int i;
	public boolean equals(Object obj)
	{
		E e=(E)obj;
		return i==e.i;
	}
}
public class Manager2
{
	public static void main(String[] args)
	{
		D d1=new D();
		d1.i=10;
		D d2=new D();
		d2.i=10;
		E e1=new E();
		e1.i=10;
		E e2=new E();
		e2.i=10;
		System.out.println(d1.equals(d2));
		System.out.println(e1.equals(e2));
		System.out.println("--------");
		System.out.println(d1.equals(e1));
		System.out.println(e1.equals(d1));
	}
}