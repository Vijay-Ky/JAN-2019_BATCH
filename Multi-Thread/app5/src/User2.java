class User2 extends Thread
{
	private ThreadPoolManager tpm;
	User2(ThreadPoolManager tpm)
	{
		this.tpm = tpm;
	}
	public void run()
	{
		while(true)
		{
			ModelThread mt = tpm.getThread();
			synchronized(mt)
			{
				mt.notify();
			}
			Util.sleep(1);
			synchronized(mt)
			{
				try
				{
					mt.wait();
				}
				catch (InterruptedException ex)
				{
				}
			}
			tpm.setThread(mt);
			Util.sleep(20000);
		}
	}
}