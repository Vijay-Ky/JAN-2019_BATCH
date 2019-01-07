class A 
{
}
class B implements Runnable
{
	A obj;
	B(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("B-run begin");
		synchronized (obj)
		{
			System.out.println("B-going to wait");
			try
			{
				obj.wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("B-coming out from wait");
		}
		System.out.println("B-run end");
	}
}
class C implements Runnable
{
	A obj;
	C(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("C-run begin");
		synchronized (obj)
		{
			System.out.println("C-going to wait");
			try
			{
				obj.wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("C-coming out from wait");
		}
		System.out.println("C-run end");
	}
}
class D implements Runnable
{
	A obj;
	D(A obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		System.out.println("D-run begin");
		synchronized (obj)
		{
			System.out.println("D-going to wait");
			try
			{
				obj.wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("D-coming out from wait");
		}
		System.out.println("D-run end");
	}
}
class Z4
{
	public static void main(String[] args) 
	{
		A obj = new A();
		Thread t1 = new Thread(new B(obj));
		Thread t2 = new Thread(new C(obj));
		Thread t3 = new Thread(new D(obj));
		t1.start();
		t2.start();
		t3.start();
		Util.sleep(10000);
		System.out.println("main-calling notifyAll");
		synchronized (obj)
		{
			obj.notifyAll();
		}
	}
}
/*
C-run begin
D-run begin
B-run begin
C-going to wait
B-going to wait
D-going to wait
main-calling notifyAll
D-coming out from wait
D-run end
B-coming out from wait
B-run end
C-coming out from wait
C-run end
*/
