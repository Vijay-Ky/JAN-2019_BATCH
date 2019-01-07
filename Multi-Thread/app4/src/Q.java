class P implements Runnable
{
	public void run()
	{
		for (int i=0;i<1000 ;i++ )
		{
			System.out.println("P-run"+i);
		}
	}
}
class Q
{

	public static void main(String[] args) 
	{
		P p1=new P();
		Thread t1=new Thread (p1);
		t1.start();
		System.out.println("--------");
		Thread t2=new Thread (p1);
		t2.start();
		System.out.println("--------");
		for (int i=4000;i<5000 ;i++ )
		{
			System.out.println("main"+i);
		}
	}
}
//CS
