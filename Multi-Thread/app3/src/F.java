class D implements Runnable
{
	public void run()
	{
		System.out.println("D-run");
		Util.sleep(50000);
		System.out.println("D- run end");
	}
}
class E extends Thread

{
	public void run()
	{
		System.out.println("E-run");
		Util.sleep(50000);
		System.out.println("E-run-end");
	}
}
class F
{

	public static void main(String[] args) 
	{
		D d1=new D();
		Thread t1=new Thread(d1);
		t1.start();
		E e1=new E();
		e1.start();
		Util.sleep(10000);
		t1.interrupt();
		Util.sleep(10000);
		t1.interrupt();
		System.out.println("done");
	}
}
/*
D-run
E-run
java.lang.InterruptedException: sleep interrupted
        at java.lang.Thread.sleep(Native Method)
        at Util.sleep(Util.java:7)
        at D.run(F.java:6)
        at java.lang.Thread.run(Thread.java:745)
D- run end
done
E-run-end

*/
