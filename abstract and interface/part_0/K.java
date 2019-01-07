abstract class A 
{
	abstract void test1();
	void test2()
	{
		System.out.println("from A.test2");
	}
}
class B extends A
{
	void test1()
	{
		System.out.println("from B.test1");
	}
}
class K
{
	public static void main(String[] agrs)
	{
		B b1 = new B();
		b1.test1();
		b1.test2();
	    System.out.println("done");
	}
}
