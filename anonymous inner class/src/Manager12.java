package app2;
class Manager12
{
	static void method1(B b1)
	{
		b1.test1();
		b1.test2();	
	}
	static void method2(C c1)
	{
		c1.test1();
		c1.test2();
	}
	public static void main(String [] args)
	{
		B b1=new B()
		{
			void test1()
			{
				System.out.println("AIC-test1");
			}
		};
		method1(b1);
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
		method2(c1);
		method1(new B()
		{
			void test1()
			{
				
			}
		});
		method2(new C()
		{
			public void test1()
			{
				System.out.println("AIC-test1");
			}
			public void test2()
			{
				System.out.println("AIC-test2");
			}
		});
		System.out.println("done");
	}
}
