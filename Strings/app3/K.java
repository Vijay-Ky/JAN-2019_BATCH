package com.app3;

public class K
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append("abcabcabc");
		
		System.out.println(sb);
		
		sb.delete(2, 6);
		
		System.out.println(sb);
	}

}
