package com.pryce;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target(ElementType.FIELD)
@interface Ann4
{
	public String someMessage();
}
class O
{
	@Ann4(someMessage="hello")
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}
