package com.lara1;
import java.util.Arrays;
import java.util.Comparator;
public class Manager9
	{
		public static void main(String []args)
		{
			int[][]x=new int [3][2];//an array of arrays is two daymanational array.
			x[0][0]=10;
			x[0][1]=10;
			x[1][0]=10;
			x[1][1]=10;
			x[2][0]=10;
		    x[2][1]=10;
			for(int i=0; i<x.length;i++)
			{
				for(int j=0; j<x[i].length;j++)
					//in order to read inner array element we required inner for loop
				{
					System.out.println(x[i][j]);
				}
			}		
		}
	}