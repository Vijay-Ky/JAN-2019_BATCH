class A
{
	synchronized void test1(A a1)
	{
		System.out.println("from test1 begin");
		Util.sleep(1000);
		a1.test2(this);
		System.out.println("from test1 end");
	}
	synchronized void test2(A a1)
	{
		System.out.println("from test2 begin");
		Util.sleep(1000);
		a1.test1(this);
		System.out.println("from test2 end");
	}
}

class B implements Runnable
{
	A a1, a2;
	B(A a1, A a2)
	{
		this.a1 = a1;
		this.a2 = a2;
	}
	public void run()
	{
		a1.test1(a2); // a2 args
	}
}
class C implements Runnable
{
	A a1, a2;
	C(A a1, A a2)
	{
		this.a1 = a1;
		this.a2 = a2;
	}
	public void run()
	{
		a2.test2(a1); // a1 args
	}
}


class Z1 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		Thread t1 = new Thread(new B(a1, a2)); // taking a1 , a2 is args
		Thread t2 = new Thread(new C(a1, a2));// taking a2 and a1 args
		t1.start();
		t2.start();
	}
}
/*
CS
*/