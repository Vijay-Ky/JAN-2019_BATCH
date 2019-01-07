package com.lara;
class T
{
	int i;
}
public class Manager11
{
	public static void main(String[] args)
	{
		T t1= new T();
		T t2= t1;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.equals(t2));
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}