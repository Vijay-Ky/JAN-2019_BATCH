package com.pryce;
@interface Counter
{
	public int count();
}
@Counter(count=3)	
class I
{
	@Counter(count=5)
	int m;
	@Counter(count=10)
	I()
	{
		
	}
	@Counter(count=100)	
	public static void main(String [] args)
	{
		System.out.println("Hello World!");
	}
}