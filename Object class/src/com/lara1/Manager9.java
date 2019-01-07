package com.lara;
class P
{
	int i;
	P(int i)
	{
		this.i=i;
	}
}
class Q
{
	int i;
	Q(int i)
	{
		this.i=i;
	}
public boolean equals(Object o1)
	{
		return(o1 instanceof Q && ((Q)o1).i==i);
	}
}
class R
{
	P param1;
	Q param2;
	String s1;
	Boolean flag;
	R(P param1, Q param2, String s1, Boolean flag)
	{
		this.param1=param1;
		this.param2=param2;
		this.s1=s1;
		this.flag=flag;
	}
	public boolean equals(Object o1)
	{
		return(o1 instanceof R &&
				((R)o1).param1 !=null &&
				((R)o1).param1.i==param1.i &&
				((R)o1).param2 !=null &&
				((R)o1).param2.equals(param2)&&
				((R)o1).s1  !=null &&
				((R)o1).s1.equals(s1)&&
				((R)o1).flag !=null &&
				((R)o1).flag.equals(flag));
	}
}
public class Manager9
{
	public static void main(String[] args)
	{
		P p1=new P(10);
		P p2=null;
		Q q1=new Q(20);
		Q q2=null;
		R r1=new R(p1,q1,"abc",true);
		R r2=new R(p1,q1,"abc",true);
		R r3=new R(p1,q2,"abc",false);
		R r4=new R(p1,q2,"xyz",true);		
		R r5=new R(p1,q2,null,true);		
		R r6=new R(p1,q2,null,null);
		System.out.println(r1.equals(r5));
		System.out.println(r2.equals(r4));
		System.out.println(r3.equals(r3));
		System.out.println(r4.equals(r2));
		System.out.println(r5.equals(r1));
		System.out.println(r6.equals(null));
	}
}