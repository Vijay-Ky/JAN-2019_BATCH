class Y extends Thread
{
	public void run()
	{
		for (int i=0;i<20 ;i++ )
		{
		try
		{  
			Thread.sleep(1000,200);  
			System.out.println("task");  
		}
		catch(InterruptedException e)
		{
			//throw new RuntimeException("Thread interrupted..."+ e);  
		}  
	}
	}
	public static void main(String[] args) 
	{
		Y t1 = new Y();
		t1.start();	
		t1.interrupt();
	}	
}

