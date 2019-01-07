public  class Thread implements Runnable
{
	public Runnable r1;
	public Threads(Runnable r1)
	{
		this.r1=r1;
	}
	public void run()
	{
		if (r1!=null)
		{
			r1.run();
		}
	}// lot of methods
}  

