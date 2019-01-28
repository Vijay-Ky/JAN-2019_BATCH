public class E
{
	public static void main(String[] args)
	{
		A a1 = new A();
    	a1.start();//O/P will not be in sequence
		//a1.run();//O/P will be in sequence
		for (int i = 101; i < 200; i++)
		{
			System.out.println("from main" + i);
		}
	}
}
