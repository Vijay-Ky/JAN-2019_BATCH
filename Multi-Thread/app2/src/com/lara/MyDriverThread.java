class MyThread extends Thread
{
	public void run()
	{
		System.out.println("from run");
		for(int i = 1; i < 40; i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class MyDriverThread 
{
	public static void main(String[] args) 
	{

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("main thread");
	}
}
