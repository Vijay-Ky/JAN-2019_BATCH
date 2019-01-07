package com.lara;
class A
{
	int i,j;
	A(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "i="+i+",j"+j;
	}
	public boolean equals(Object obj)
	{
		return(obj instanceof A &&
				((A)obj).i==i &&
				((A)obj).j==j);
	}
	public int hashCode()
	{
		String s1= Integer.toString(i);
		String s2= Integer.toString(j);
		int hash=s1.hashCode();
		hash +=s2.hashCode();
		return hash;
	}
}
public class Manager1
{
	public static void main(String[] args)
	{
		A a1= new A(10,20);
		A a2= new A(20,10);
		A a3= new A(10,20);
		A a4= new A(20,20);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a4.hashCode());
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a2.equals(a3));
		System.out.println(a2.equals(a4));
		System.out.println(a3.equals(a4));
	}
}
