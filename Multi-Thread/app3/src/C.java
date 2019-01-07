class C implements Runnable 
{
	public void run()
	{
		System.out.println("run begine:");
		Util.sleep(1000);
		System.out.println("run end:");
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		Thread t1=new Thread(c1);
		t1.start();
		Util.sleep(1000);
		t1.interrupt();
		System.out.println("Main end:");
	}
}
/*
run begine:
Main end:
run end:
*/