class MyThreadDemo extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 10; i++)
			{
				System.out.println(Thread.currentThread().getName() + "from run" + i);
			}
			Thread.sleep(4000);
		}
		catch (InterruptedException ex)
		{
			System.out.println(ex);
		}
	}
}
class  InterruptedDemo
{
	public static void main(String[] args) 
	{
		MyThreadDemo t1 = new MyThreadDemo();
		t1.start();
		t1.interrupt();
		System.out.println("Main Thread");
	}
}
