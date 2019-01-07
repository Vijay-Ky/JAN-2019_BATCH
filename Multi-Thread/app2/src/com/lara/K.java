

public class K implements Runnable
{
	public void run()
	{
		for (int i = 101; i < 200; i++)
		{
			System.out.println("K-run:" + i);
		}
	}
}
//CS
//no main method so RTE
