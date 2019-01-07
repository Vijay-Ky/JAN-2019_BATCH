

public class H implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("from run:" + i);
		}
	}
}
//CS
//no main method so RTE
