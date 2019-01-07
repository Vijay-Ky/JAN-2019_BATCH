package app2;
class Manager4
{
	public static void main(String [] args)
	{
		A a1=new A()
		{
			
		};
		a1.test1();
		a1.test2();
		System.out.println("-----");
		A a2=new A()
		{
			void test1()
			{
				System.out.println("AIC-test1");
			}
		};
		a2.test1();
		a2.test2();
		System.out.println("-----");
		A a3=new A()
		{
			void test2()
			{
				System.out.println("AIC-test2");
			}
		};
		a3.test1();
		a3.test2();
		System.out.println("-----");
		A a4=new A()
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
		a4.test1();
		a4.test2();
	}
}	
