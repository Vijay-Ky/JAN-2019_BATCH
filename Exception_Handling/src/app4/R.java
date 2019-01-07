class R 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
