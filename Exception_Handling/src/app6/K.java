class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}
