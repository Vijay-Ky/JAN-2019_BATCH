

public class BB
{
	public static void main(String[] args)
	{
		BB b1 = new BB();
		b1.start();
		System.out.println("---------");
		BB b2 = new BB();
		b2.start();
		System.out.println("---------");
		for (int i = 101; i <= 200; i++)
		{
			System.out.println("from main:" + i);
		}
	}
}
//CTE