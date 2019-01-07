class ModelThread extends Thread 
{
	public void run()
	{
		while(true)
		{
			try
			{
				synchronized(this)
				{
					wait();
				}
			}
			catch (InterruptedException ex)
			{
				
			}
			//some common task
			for(int i = 0; i < 10; i++)
			{
				System.out.println("common task by : " + getId() +" with i = " + i);
				Util.sleep(1000);
			}
			synchronized(this)
			{
				notify();
			}
		}
	}
}