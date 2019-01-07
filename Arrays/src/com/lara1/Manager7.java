package com.lara1;
import java.util.Arrays;
import java.util.Comparator;
class F 
{
	int i,j;
	F(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public String toString()
	{
		return "("+i+","+j+")";
	}
}
class G implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		F f1=(F)o1;
		F f2=(F)o2;
		return f1.i-f2.i;
	}
}
class H implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		F f1=(F)o1;
		F f2=(F)o2;
		return f1.j-f2.j;
	}
}
public class Manager7
{
	public static void main(String []args)
	{
		F[]x={new F(1,9),new F(5,1),new F(2,3), new F(9,5),new F(3,8), new F(7,4)};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new G());
		System.out.println(Arrays.toString(x));
		Arrays.sort(x,new H());
		System.out.println(Arrays.toString(x));
	}
}