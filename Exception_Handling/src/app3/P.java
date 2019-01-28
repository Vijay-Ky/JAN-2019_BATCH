class P 
{
	int test()
	{
		try
		{
			//code
			return 19;
		}
		catch (ArithmeticException ex)
		{
			return 2;	
		}
		catch (NullPointerException ex)
		{
			return 3;	
		}
			return 200;
	}
}

