package com.pryce;
@interface SomeInfo
{
	public String someMessage();
}
@SomeInfo(someMessage="some desc")	
class H
{
	@SomeInfo(someMessage="about i")
	int j;
	@SomeInfo(someMessage="about con")
	H()
	{
		
	}
	@SomeInfo(someMessage="some desc")	
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}