class Q 
{
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		try
		{
			Object obj = q1.clone();
		}
		catch (CloneNotSupportedException ex)
		{
		}
		System.out.println("done");
	}
}
