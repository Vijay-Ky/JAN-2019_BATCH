abstract class AB
{
	void test()
	{
		System.out.println("test");
	}
}
class ABC extends AB
{
	public static void main(String[] args) 
	{
		ABC abc = new ABC();
		abc.test();
		System.out.println("Hello World!");
	}
}
