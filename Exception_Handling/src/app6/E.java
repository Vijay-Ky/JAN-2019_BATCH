class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1(); 
		System.out.println("main end");
	}
	static void test1()
	{
		System.out.println("test1 begin");
		try
		{
			int i = 10/0;
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("test1 end");
	}
}
