class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i < 10; i++)
		{
			System.out.println("child Thread");
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}
class JoinDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t1 = new MyThread();
		t1.start();
		t1.join(1000);
		for(int i = 1; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
