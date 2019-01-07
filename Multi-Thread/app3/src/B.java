class B implements Runnable
{
	public void run()
	{
		for (int i=0;i<10 ;i++ )
		{
			System.out.println("run:"+i);
			Util.sleep(1000);
		}
	}
	public static void main(String[] args) 
	{
		B b1=new B();
		Thread t1=new Thread(b1);
		t1.start();
		for (int i=10;i<30 ;i++ )
		{
			System.out.println("main:"+i);
			Util.sleep(1000);
		}
		
	}
}
/*
run:0
main:10
run:1
main:11
main:12
run:2
main:13
run:3
run:4
main:14
run:5
main:15
run:6
main:16
run:7
main:17
run:8
main:18
main:19
run:9
main:20
main:21
main:22
main:23
main:24
main:25
main:26
main:27
main:28
main:29
*/