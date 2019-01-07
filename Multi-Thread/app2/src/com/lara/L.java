

public class L
{
	public static void main(String[] args)
	{
		J j1 = new J();
		Thread t1 = new Thread(j1);
		t1.start();//for registration purpose we have to call start
//		t1.run();
		System.out.println("---------");
		K k1 = new K();
		Thread t2 = new Thread(k1);
		t2.start();
//		t2.run();
		System.out.println("---------");
		for (int i = 201; i < 300; i++)
		{
			System.out.println("L-main:" + i);
		}
	}
}
//CTE
