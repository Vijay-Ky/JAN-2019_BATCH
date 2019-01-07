class D  
{		
	D()
	{
		System.out.prinln("D()");
	}
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("---------");
		D d2 = new D();
		System.out.println("---------");
	}
}
