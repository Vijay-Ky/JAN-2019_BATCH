package com.pryce;
@interface M
{
	public String message();
	public boolean flag();
}
@M(message="some info")	
class K
{
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}