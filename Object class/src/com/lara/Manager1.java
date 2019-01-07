package com.lara;
class A
{
	int i; 
}
public class Manager1
{
	public static void main(String[] args)
	{
		A a1= new A();
		a1.i=10;
		A a2= new A();
		a2.i =20;
		System.out.println(a1);
		System.out.println(a2);
	}
}