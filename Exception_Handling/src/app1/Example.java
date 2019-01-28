class Example 
{
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		try
		{
			int i = 1/0;
		}
		catch (ArithmeticException ex )
		{
			System.out.println(ex);
		}
		
		System.out.println("main end");
	}
}
