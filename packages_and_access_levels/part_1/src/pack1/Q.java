package pack1;
class Q
{
	private void test()
	{

	}
	
	private Q()
	{
		System.out.println("Q()");
	}
}
class R extends Q
{
	public static void main(String[]args)
	{
		System.out.println("done");
	}
}
