class A extends Thread 
{
	public void run()
	{
		for (int i=0;i<20 ;i++ )
		{
			System.out.println("from run:"+i);
			try
			{
				sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.start();
		for (int i=20;i<20 ;i++ )
		{
			System.out.println("main:"+i);
			try
			{
				sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}
