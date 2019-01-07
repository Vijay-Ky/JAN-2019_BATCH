class A
{
	void test()
	{
		System.out.println("from A");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("from B");
	}
}
class Manager1
{
	public static void main(String[]args)
	{
		A a1=new A();
		B b1 = new B();
		A[] x = {a1, b1};
		for(int i = 0; i < x.length; i++)
		{
			x[i].test();
		}
	}
}