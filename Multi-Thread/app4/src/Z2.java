class A 
{
	synchronized void test1()
	{
		System.out.println("test1 begin");
		try
		{
			wait();
		}
		catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("test1 end");
	}
	synchronized void test2()
	{
		System.out.println("test2 begin");
		notify();
		System.out.println("test2 end");
	}
}
class B implements Runnable
{
	A a1;
	B(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		System.out.println("B.run begin");
		a1.test1();
		System.out.println("B.run end");
	}
}
class C implements Runnable
{
	A a1;
	C(A a1)
	{
		this.a1 = a1;
	}
	public void run()
	{
		System.out.println("C.run begin");
		Util.sleep(10000);
		System.out.println("C-> sleep end");
		a1.test2();
		System.out.println("C.run end");
	}
}
class Z2
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		Thread t1 = new Thread(new B(a1));
		Thread t2 = new Thread(new C(a1));
		t1.start();
		t2.start();
		System.out.println("main end");
	}
}
/*
B.run begin
C.run begin
main end
test1 begin
C-> sleep end
test2 begin
test2 end
C.run end
test1 end
B.run end
*/