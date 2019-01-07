package com.lara;
class F
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof F))
		{
			return false;
		}
		return i==((F)obj).i;
	}
}
class G
{
	int i;
	public boolean equals(Object obj)
	{
		if(!(obj instanceof G))
		{
			return false;
		}
		return i==((G)obj).i;
	}
}
public class Manager3
{
	public static void main(String[] args)
	{
		F f1=new F();
		f1.i=10;
		F f2=new F();
		f2.i=10;
		G g1=new G();
		g1.i=10;
		G g2=new G();
		g2.i=10;
		System.out.println(f1.equals(f2));
		System.out.println(g1.equals(g2));
		System.out.println("--------");
		System.out.println(f1.equals(g1));
		System.out.println(g2.equals(f2));
		System.out.println("--------");
		
	}
}