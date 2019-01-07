//Non-Static Method Creation and Calling
class D
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		test1();//Non-static test1 cant be used in the static context
		System.out.println("from test2");
	}
}
