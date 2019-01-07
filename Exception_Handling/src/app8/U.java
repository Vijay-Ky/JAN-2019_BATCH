class U 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println("from test");
	}
}