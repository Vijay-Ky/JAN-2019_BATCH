package app2;
class D
{
	D()
	{
		System.out.println("D()");
	}
	D(int i)
	{
	System.out.println("D(int)");	
	}
	{
		System.out.println("D-IIB");
	}
}
class Manager15
{
	public static void main(String [] args)
	{
		D d1=new D()
		{
			{
				System.out.println("AIC-IIB");
			}
		};
		System.out.println("--------");
		D d2=new D(10)
		{
			{
				System.out.println("AIC-IIB");
			}
		};
		
	}	
}