package com.lara;
class C
{
	int i,j,k;
	public int hashCode()
	{
		String s1= Integer.toString(i);
		String s2= Integer.toString(k);
		int hash=s1.hashCode();
		hash +=s2.hashCode();
		return hash;
	}
	public boolean equals(Object obj)
	{
		System.out.println("equals");
		return(obj instanceof C &&
				((C)obj).i==i &&
				((C)obj).k==k);
	}
	
}
public class Manager3
{
	public static void main(String[] args)
	{
		C c1 =new C();
		c1.i=10;
		c1.j=20;
		c1.k=30;
		C c2 =new C();
		c2.i=10;
		c2.j=20;
		c2.k=30;
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
}
