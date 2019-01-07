package app2;
class Manager9
{
	public static void main(String [] args)
	{
		C c1=new C()
		{
			public void test1()
			{
				System.out.println("AIC-test1");
			}
			public void test2()
			{
				System.out.println("AIC-test2");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}