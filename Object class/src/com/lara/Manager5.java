package com.lara;
class E
{
	int i,j;
	E(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
}
public class Manager5
{
	public static void main(String[] args)
	{
		E e1= new E(10,20);
		E e2= new E(10,20);
		System.out.println(e1);
		System.out.println(e2);
	}
}