package com.app1;
//How to avoid Duplicates ???
import java.util.ArrayList;

public class Interview
{

	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();

		if (!list.contains(90))
		{
			list.add(90);
		}
		if (!list.contains(90))
		{
			list.add(90);		
		}
		if (!list.contains(90))
		{
			list.add(90);		
		}
		
		System.out.println(list);
		
/*		list.add(90);
		
		list.add(90);
		
		list.add(90);
	
		list.add(40);
				
		list.add(40);
		
		list.add(40);
		
		list.add(40);
		
		System.out.println(list);
		
*/		

	}

}
