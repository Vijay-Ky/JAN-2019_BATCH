//Non-Static Method Creation and Calling
class H
{
	void test()
	{
		System.out.println("Hello World!");
	}
	public static void main(String[] args)
	{
		H h1 = new H();
		h1.test();
		System.out.println("Hello World!");
	}
}
