class C
{
	void test()
	{
		System.out.println("from C-test");
	}
}
class D extends C
{
	void test()
	{
		System.out.println("from D-test");
	}
}
class Manager2
{
	static void method1(C c1)
	{
		c1.test();
	}
	public static void main(String[]args)
	{
		C c1 = new C();
		C c2 = new D();
		method1(c1);
		method1(c2);
	}
}