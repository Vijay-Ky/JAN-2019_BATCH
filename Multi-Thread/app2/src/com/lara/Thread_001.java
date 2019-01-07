

public class Thread_001 implements Runnable
{
	private Runnable r1;
	public Thread_001(Runnable r1)
	{
		this.r1 = r1;
	}
	@Override
	public void run()
	{
		if (r1 != null)
		{
			r1.run();
		}
	}
}
//CS
//no main method so RTE
