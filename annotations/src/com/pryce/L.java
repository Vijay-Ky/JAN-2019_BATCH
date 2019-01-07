package com.pryce;
@interface Ann1
{
	public int countValue() default 1;
	public String someMessage() default "abc";
}
@Ann1(countValue=10)	
class L
{
	@Ann1
	public int test;
	@Ann1(someMessage="hello")
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}
