

public class A extends Thread
{
	public void run()
	{
		for (int i = 0; i <= 100; i++)
		{
			System.out.println("A-run" + i);
		}
	}
}
//CS
//no main method so RTE
