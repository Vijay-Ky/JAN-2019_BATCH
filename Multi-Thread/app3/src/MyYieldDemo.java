class MyThread extends Thread
{
	public void run()
	{
		for(int i = 1; i < 10; i++)
		{
			System.out.println("child Thread");
			Thread.yield();
		}
	}
}
class MyYieldDemo
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.start();
		for(int i = 1; i < 10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}
