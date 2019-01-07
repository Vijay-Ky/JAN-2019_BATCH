package pack1;
class H
{
	public static void main(String[] args)
	{
	System.out.println(1);
	assert false:test();
	System.out.println(2);
	}
	static int test()
	{
		System.out.println("done");
		return 100;
	}
}