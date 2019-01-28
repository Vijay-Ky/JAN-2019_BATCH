public class N extends M implements Runnable
{
	//some member
	public void run()//only run method ready for thread
	{
		for (int i = 100; i < 200; i++)
		{
			System.out.println("N-run" + i);
		}
	}
}