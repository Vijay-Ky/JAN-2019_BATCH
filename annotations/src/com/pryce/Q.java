package com.pryce;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface Anno6
{
	public String doStuff();
	public int size()default 0;
}
class Q
{
	@Anno6(doStuff="abc",size=100)
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}
