class Q implements Runnable
{
	public void run() {
	
	System.out.println("Q-Run-Begin");
	Util.sleep(1000);
	System.out.println("Q-run-end");   } 
}

class R implements Runnable 
{
	public void run()
	{
		System.out.println("R-run-begin");
		Util.sleep(1000);
		Thread t1 = new Thread(new Q());
		t1.start();
		try
		{
			t1.join();
		}
		catch (InterruptedException ex)
		{
			System.out.println("from catch");
		}
		System.out.println("R-run-end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Thread t1 = new Thread(new R());
		t1.start();
		Util.sleep(2000);
		//t1.interrupt();

		System.out.println("main end");
	}
}
/*
main begin
R-run-begin
Q-Run-Begin
main end
Q-run-end
R-run-end
*/