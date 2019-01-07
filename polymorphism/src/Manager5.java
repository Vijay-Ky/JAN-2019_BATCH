class J
{
	static int test()
	{
		System.out.println("frm J test");
		return 10;
	}
	static
	{
		System.out.println("SIB-J");
	}
	public static void main(String[]args)
	{
		System.out.println(test());
	}
}
class K extends J
{
	static
	{
		System.out.println("SIB-K");
	}	
}