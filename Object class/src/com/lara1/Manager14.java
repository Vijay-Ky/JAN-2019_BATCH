package com.lara;
class W
{
	int i;
	String j;
	char k;
	boolean m;
	public int hashCode()
	{
		String s1= Integer.toString(i);
		String s2=Character.toString(k);
		String s3=Boolean.toString(m);
		int hash=s1.hashCode();
		hash +=s1.hashCode();
		hash +=s2.hashCode();
		hash +=s3.hashCode();
		hash +=j.hashCode();
		return hash;
	}
}
public class Manager14
{
	public static void main(String[] args)
	{
		W w1= new W();
		w1.i=10;
		w1.j="abc";
		w1.k='p';
		w1.m=true;
		System.out.println(w1.hashCode());
		W w2= new W();
		w2.i=10;
		w2.j="abc";
		w2.k='p';
		w2.m=true;
		System.out.println(w2.hashCode());
	}
}