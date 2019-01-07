class W // containing two synchronize method
{ // synchronization is object wise not method wise
	synchronized void test1()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println("test1 : " + i);
		}
	}
	synchronized void test2()
	{
		for (int i = 1000; i < 2000; i++)
		{
			System.out.println("test2 : " + i);
		}
	}
}

class X implements Runnable
{
	W obj;
	X(W obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test1();
	}
}
class Y implements Runnable
{
	W obj;
    Y(W obj)
	{
		this.obj = obj;
	}
	public void run()
	{
		obj.test2();
	}
}

class Z
{
	public static void main(String[] args) 
	{
		W obj = new W(); // one W object is sharing to t1 and t2
		Thread t1 = new Thread(new X(obj)); // X is runnable and obj is w type
		t1.start();
		Thread t2 = new Thread(new Y(obj));// T is runnable and obj is w type
		t2.start();
	}
}
// output come in sequential order
//CS
