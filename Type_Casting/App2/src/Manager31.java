class Manager31
{
	static void test(Object obj)
	{
		System.out.println(obj instanceof A);
		if(obj instanceof A)
		{
			System.out.println("v can cast into A");
			A a1 = (A)obj;
		}

		if(obj instanceof B)
		{
			System.out.println(obj instanceof B);
			System.out.println("v can cast into B");
			B b2 = (B)obj;
		}
		if(obj instanceof C)
		{
			System.out.println(obj instanceof C);
			System.out.println("v can cast into C");
			C c2 = (C)obj;
		}
		if(obj instanceof D)
		{
			System.out.println(obj instanceof D);
			System.out.println("v can cast into D");
			D d2 = (D)obj;
		}
		System.out.println("-----------------");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		A a4 = new D();
		test(a1);
		test(a2);
		test(a3);
		test(a4);
	}
}