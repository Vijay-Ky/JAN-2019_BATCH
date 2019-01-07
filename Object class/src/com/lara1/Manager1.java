package com.lara;
class A
{
}
class B extends A
{
}
class C
{
	
}
public class Manager1
{
	public static void main(String[] args)
	{
		A a1=new A();
		A a2=new A();
		B b1=new B();
		C c1=new C();
		System.out.println(a1==a2);
		System.out.println(a1==b1);
		System.out.println(b1==a2);
		//System.out.println(a1==c1);
		//System.out.println(c1==b1);
		System.out.println(a1.equals(a2));
		System.out.println(b1.equals(c1));
		System.out.println(c1.equals(a1));
	}
}