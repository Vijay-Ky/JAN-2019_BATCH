class A 
{
	void test1()
	{
		System.out.println("test1 begin");
		synchronized (this)//this is an argument
		{
			System.out.println("going to wait from test1");
			try
			{
				wait();
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
			
			System.out.println("coming out from wait in test1");
		}
		System.out.println("test1 end");
	}
	void test2()
	{
		System.out.println("test2 begin");
		synchronized (this)
		{
			System.out.println("calling notifyAll in test2");
			notifyAll();
			System.out.println("after calling notifyAll in test2");
		}
		System.out.println("test2 end");
	}
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
		obj.test1();
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
		obj.test1();
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
		obj.test1();
	}
}
class Z3
{
	public static void main(String[] args) 
	{
		A obj1 = new A();
		A obj2 = new A();
		Thread t1 = new Thread(new B(obj1));//one reference sharing in all three threads
		Thread t2 = new Thread(new C(obj1));
		Thread t3 = new Thread(new D(obj1));
		t1.start();
		t2.start();
		t3.start();

		System.out.println("main is going to sleep for 10 sec");
		Util.sleep(10000);
		System.out.println("main ===> after sleep calling test2");
		//obj1.test2();
		//obj2.test2();
		//obj1.notifyAll();
		synchronized (obj1)
		{
			obj1.notifyAll();
		}
				System.out.println("main end");
	}
}
/*
obj1.test2();
obj1.test2();
============
main is going to sleep for 10 sec
test1 begin
going to wait from test1
test1 begin
going to wait from test1
test1 begin
going to wait from test1
main ===> after sleep calling test2
test2 begin
calling notifyAll in test2
after calling notifyAll in test2
test2 end
main end
coming out from wait in test1
test1 end
coming out from wait in test1
test1 end
coming out from wait in test1
test1 end
--------------
obj2.test2();
=========
test1 begin
test1 begin
main is going to sleep for 10 sec
test1 begin
going to wait from test1
going to wait from test1
going to wait from test1
main ===> after sleep calling test2
test2 begin
calling notifyAll in test2
after calling notifyAll in test2
test2 end
main end
-------------
obj1.notifyAll();//Exception
==============
main is going to sleep for 10 sec
test1 begin
test1 begin
test1 begin
going to wait from test1
going to wait from test1
going to wait from test1
main ===> after sleep calling test2
Exception in thread "main" java.lang.IllegalMonitorStateException
        at java.lang.Object.notifyAll(Native Method)
        at Z3.main(Z3.java:88)
----------------
synchronized (obj1)
		{
			obj1.notifyAll();
		}
=============================
test1 begin
going to wait from test1
test1 begin
going to wait from test1
main is going to sleep for 10 sec
test1 begin
going to wait from test1
main ===> after sleep calling test2
main end
coming out from wait in test1
test1 end
coming out from wait in test1
test1 end
coming out from wait in test1
test1 end
*/