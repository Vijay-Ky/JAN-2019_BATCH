abstract class A 
{
	abstract void test1();
	void test2()
	{
		System.out.println("from A.test2");
	}
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{
		System.out.println("from B.test1");
	}
}
class C1 extends B
{
	void test3()
	{
		System.out.println("from C.test1");
	}
	public static void main(String[] agrs)
	{
		//A a1 = new A();
		//B b1 = new B();
		C1 c1 = new C1();
		c1.test1();
		c1.test2();
		c1.test3();
	    System.out.println("done");
	}
}

