class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			throw new StackOverflowError();
		}
		System.out.println("main end");
	}
}
