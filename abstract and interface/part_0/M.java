abstract class A 
{
	A()
	{
		System.out.println("A()");
	}
	abstract void test1();
	void test2()
	{
		System.out.println("from A.test2");
	}
	abstract void test3();
}
abstract class B extends A
{
	B(int i)
	{
		System.out.println("B(int)");
	}
	void test1()
	{
		System.out.println("from B.test1");
	}
}
class C extends B
{
	C()
	{
		super(90);
		System.out.println("C()");
	}
	void test3()
	{
		System.out.println("from C.test3");
	}
}
class M
{
	public static void main(String[] agrs)
	{
		//B b1 = new B();
		C c1 = new C();
		c1.test1();
		c1.test2();
		c1.test3();
	    System.out.println("done");
	}
}
