package app2;
class Manager7
{
	public static void main(String [] args)
	{
		B b1=new B()
		{
			void test1()
			{
				System.out.println("AIC-test1");
			}
			void test2()
			{
				System.out.println("AIC-test2");
			}
		};
		b1.test1();
		b1.test2();
		System.out.println("done");
	}
}