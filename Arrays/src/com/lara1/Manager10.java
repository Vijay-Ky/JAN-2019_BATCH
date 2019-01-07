package com.lara1;
import java.util.Arrays;
import java.util.Comparator;
public class Manager10
	{
		public static void main(String []args)
		{
			int[]x[]=new int [3][];//empty inner array declered is possible
			x[0]=new int[2];
			x[1]=new int[4];
			x[2]=new int[3];
			System.out.println(x[1][1]);
			x[2][2]=100;
			System.out.println(x[2][2]);		
		}
	}