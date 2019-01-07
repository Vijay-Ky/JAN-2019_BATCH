

public class O
{
	public static void main(String[] args)
	{
		N n1 = new N();
		//keep using
		Thread t1 = new Thread(n1);
		t1.start();
		for (int i = 201; i < 300; i++)
		{
			System.out.println("O-main" + i);
		}
	}
}
//CTE
