package com.app3;

public class G
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
		
		sb.append("12345678123456789");
		
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());
	}

}
