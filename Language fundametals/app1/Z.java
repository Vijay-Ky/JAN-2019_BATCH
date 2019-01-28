class A 
{
	static 
	{
		System.out.println("A.SIB");
	}

	static void test()
	{
		System.out.println("A.test()");
	}
}
class Z
{
	static
	{
		System.out.println("Z.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Z.main begin");
		A.test();
		System.out.println("----------");
		A.test();
		System.out.println("----------");
		A.test();
		System.out.println("Z.main end");
	}
}
