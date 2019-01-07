package com.pryce;
@interface F
{
	public String someMessage();
}	
class G
{
	@ F(someMessage="my first method")
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}