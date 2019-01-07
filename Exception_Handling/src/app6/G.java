class G 
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
		test2();
		System.out.println("test1 end");
	}
	static void test2()
	{
		System.out.println("test2 begin");
		try
		{
			int i = 10/0;
		}
		catch (ArithmeticException(ex))
		{
			System.out.println(ex)
		}
		System.out.println("test2 end");
	}
	System.out.println("main end");
}
