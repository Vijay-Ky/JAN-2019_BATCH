class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			try
			{
				throw new NullPointerException();
			}
			catch (NullPointerException ex)
			{
				System.out.println(ex);
			}
		}
		System.out.println("main end");
	}
}
