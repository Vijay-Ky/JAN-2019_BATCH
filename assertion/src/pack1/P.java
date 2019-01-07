package pack1;
class P
{
	public static void  main(String[] args)
	{
		System.out.println(1);
		assert true:test();
		System.out.println(2);
	}
	static String test()
	{
		System.out.println("done");
		return "abc";
	}
	
}