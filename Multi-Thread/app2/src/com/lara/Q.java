

public class Q
{
	public static void main(String[] args)
	{
		P p1 = new P();
		Thread t1 = new Thread(p1);
		t1.start();
		System.out.println("--------");
		Thread t2 = new Thread(p1);
		t2.start();
		System.out.println("--------");
		for (int i = 100; i < 200; i++)
		{
			System.out.println("Q-main:" + i);
		}
	}
}
//CTE