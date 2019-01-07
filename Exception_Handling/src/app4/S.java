class S 
{
	public static void main(String[] args) 
	{
		try
		{
			int i = 10 /0;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
