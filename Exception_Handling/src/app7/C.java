class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			throw new ArithmeticException();
		}
		System.out.println("main end");
	}
}
