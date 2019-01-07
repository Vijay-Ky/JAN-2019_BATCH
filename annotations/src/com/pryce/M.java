package com.pryce;
@interface Ann2
{
	public int countValue();
	public String someMessage() default "abc";
}
@Ann1(countValue=10)	
class M
{
	@Ann2(someMessage="hello")
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}
