	class P 
{
	static void test1()
	throws ClassNotFoundException
	{
		System.out.println("test1 begin");
		Class.forName("");
		System.out.println("test1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			test1();
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}
