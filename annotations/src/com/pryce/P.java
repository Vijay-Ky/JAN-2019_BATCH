package com.pryce;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.SOURCE)
@interface Ann5
{
	public int countValue();
}
class P
{
	@Ann5(countValue=20)
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}
