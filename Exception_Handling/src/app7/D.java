class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			throw new ArithmeticException("any message");
		}
		System.out.println("main end");
	}
}
