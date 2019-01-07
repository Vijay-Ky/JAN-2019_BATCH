 class TestThrow1
 {  
	static void validate(boolean flag) 
	{  
		if(flag)  
			throw new IOException("out of service");  
		else  
			System.out.println("welcome");  
	}  
	public static void main(String args[]) throws Exception
	{  
		try
		{
			validate(true);
		}  
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		//System.out.println("rest of the code...");  
	}  
}