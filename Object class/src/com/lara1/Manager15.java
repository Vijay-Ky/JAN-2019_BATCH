package com.lara;
class X
{
	int i;
	public int hashCode()
	{
		String s1= Integer.toString(i);
		int i=s1.hashCode();
		return i;
	}
}
class Y
{
	int k;
	String s1;
	boolean b1;
	X x1;
	public int hashCode()
	{
		String str1= Integer.toString(k);
		String str2= Boolean.toString(b1);
		int hash=0;		
		hash=str1.hashCode();
		hash+=str2.hashCode();
		if(s1!= null)
		{
			hash+=s1.hashCode();
		}
		if(x1 !=null)
		{
			hash+=x1.hashCode();
		}
		return hash;
	}
}
public class Manager15
	{
	public static void main(String[] args)
	{
		X x1= new X();
		x1.i=10;
		Y y1= new Y();
		y1.k=20;
		y1.s1="abc";
		y1.b1=false;
		y1.x1=x1;
		X x2= new X();
		x2.i=10;
		Y y2= new Y();
		y2.k=20;
		y2.s1="abc";
		y2.b1=false;
		y2.x1=x2;
		System.out.println(y1.hashCode());
		System.out.println(y2.hashCode());
	}
}