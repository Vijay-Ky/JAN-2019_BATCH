class Overload
{
	public static void test()
	{
		System.out.println("void test");
	}

	public static int test(int i)
	{
		System.out.println("int test");
		return i;
	}

	public static void main(String[] a)
	{
		test();
		//System.out.println(test());
		System.out.println(test(10));
	}
}