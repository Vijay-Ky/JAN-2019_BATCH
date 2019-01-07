public class G
{
	public static void main(String[] args)
	{
		C c1 = new C();
		c1.start();
		System.out.println("-----2----");
		System.out.println("-----3----");
		System.out.println("-----4----");
		D d1 = new D();
		d1.start();
		System.out.println("-----1-----");
		for (int i = 301; i <= 400; i++)
		{
			System.out.println("from main" + i);
		}
	}
}
//CTE
