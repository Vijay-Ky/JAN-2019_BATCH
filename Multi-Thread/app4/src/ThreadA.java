class ThreadA
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b)
		{
			System.out.println("Main Method is calling the wait()");
			b.wait();
			System.out.println("Main got the notification");
			System.out.println(b.total);
		}
	}
}
class ThreadB extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child Starting to caluculate");
			for(int i = 1; i <= 100; i++)
			{
				total = total + i;
			}
			System.out.println("Sending the notification");
			this.notify();
		}
	}
}
