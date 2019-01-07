package com.app3;

public class I
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer(500);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		System.out.println("-------");
		
		sb.append(987654321);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		System.out.println("----------");
		
		sb.trimToSize();
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
		
		
		
	}

}
