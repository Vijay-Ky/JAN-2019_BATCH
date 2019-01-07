package com.lara;
class V
{
	int i,j;
	V(int i, int j)
	{
	this.i=i;
	this.j=j;
	}
	public int hashCode()
	{
		return i+j;
	}
}
public class Manager13
{
	public static void main(String[] args)
	{
		V v1= new V(10,20);
		V v2= new V(10,20);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println("----------");
		V v3= new V(40,30);
		V v4= new V(40,20);
		System.out.println(v3.hashCode());
		System.out.println(v4.hashCode());
		System.out.println("----------");
		V v5= new V(40,30);
		V v6= new V(40,20);
		System.out.println(v5.hashCode());
		System.out.println(v6.hashCode());
	}
}