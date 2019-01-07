public class D extends Thread
{
	public void run()
	{
		for (int i = 101; i <= 200; i++)
		{
			System.out.println("from D.run" + i);
		}
	}
}
//CS
//no main method so RTE
