class E1 
{		
	{
		System.out.println("E-IIB1");
	}
	E1(int i)
	{
		System.out.println("E1(int)");
	}
	public static void test()
	{
		{
			System.out.println("test IIB");
		}
	}
	
	
	public static void main(String[] args) 
	{
		test();
		E1 e1 = new E1(90);
		System.out.println("---------");
		E1 e2 = new E1(30);
		System.out.println("---------");
		
	}
}
