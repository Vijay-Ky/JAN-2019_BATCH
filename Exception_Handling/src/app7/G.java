class G 
{
	public static void main(String[] args)
	throws ClassNotFoundException
	{
		System.out.println("main begin");
		if(true)
		{
			{
				throw new ClassNotFoundException();
			}	
		}
		System.out.println("main end");
	}
}
