package com.pryce;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.METHOD)
@interface Ann3
{
	public String someMessage();
}
class N
{
	@Ann3(someMessage="hello")
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}
