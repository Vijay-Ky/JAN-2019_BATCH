class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test1();
		}
		catch (ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main end");
	}
	static void test1()
	{
		System.out.println("test1 begin");
		int i = 10/0;
		System.out.println("test1 end");
	}
}
