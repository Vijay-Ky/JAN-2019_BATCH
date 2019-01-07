package com.lara;
class L
{
	int i;
	L(int i)
	{
		this.i=i;
	}
}
class M
{
	L param1;
	int param2;
	M(L param1, int param2)
	{
		this.param1=param1;
		this.param2=param2;
	}
	public boolean equals(Object o1)
	{
		return(o1 instanceof M &&
				((M)o1).param1 !=null &&
				((M)o1).param1.i==param1.i &&
				param2==((M)o1).param2);
	}
}
public class Manager6
{
	public static void main(String[] args)
	{
		L l1=new L(90);
		L l2=null;
		M m1=new M(l1,50);
		M m2=new M(l1,50);
		M m3=new M(l2,50);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m3.equals(null));
		System.out.println(m1.equals(l1));
	}
}