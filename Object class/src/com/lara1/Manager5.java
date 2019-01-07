package com.lara;
class J
{
	int i;
	J(int i)
	{
		this.i=i;
	}
}
class K
{
	J param1;
	int param2;
	K(J param1, int param2)
	{
		this.param1=param1;
		this.param2=param2;
	}
	public boolean equals(Object obj)
	{
		K obj1=(K)obj;
		return(obj1.param1.i==param1.i&&
				param2==obj1.param2);
	}
}
public class Manager5
{
	public static void main(String[] args)
	{
		J j1=new J(90);
		K k1=new K(j1,30);
		K k2=new K(j1,30);
		System.out.println(k1.equals(k2));
		System.out.println("--------");
		K k3=new K(null,30);
		System.out.println(k1.equals(k3));
	}
}