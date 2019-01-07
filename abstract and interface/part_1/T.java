interface A
{
	void test1();
	void test2();
	void test3();
}
abstract class B implements A 
{
	public void test1()
	{
		System.out.println("B.test1()");
	}
}
abstract class C extends B
{
	public void test2()
	{
		System.out.println("C.test1()");
	}
}
class T extends C 
{
	public void test3()
	{
		System.out.println("T.test1()");
	}
	public static void main(String args[])
	{
		T t1 = new T();
		t1.test1();
		t1.test2();
		t1.test3();
		System.out.println("done");
	}
}
