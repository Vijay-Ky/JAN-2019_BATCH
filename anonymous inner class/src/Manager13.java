package app2;
class Manager13
{
	public static void main(String [] args)
	{
		B b1=method1();
		C c1=method2();
		b1.test1();
		b1.test2();	
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
	static B method1()
	{
		B b1=new B()
		{
			void test1()
			{
				System.out.println("AIC-test1");
			}
		};
		return b1;
	}
	static C method2()
	{
		return new C()
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
		
	}
}
