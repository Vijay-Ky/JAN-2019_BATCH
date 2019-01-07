//Non-Static Method Creation and Calling
class I
{
	int X;
	static void test()
	{
		I rv=new I();
		System.out.println(rv.X);
	}
	
}
