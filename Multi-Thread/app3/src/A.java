class A extends Thread 
{
	public void run()
	{
		for (int i=0;i<20 ;i++ )
		{
			System.out.println("from run:"+i);
			try
			{
				sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.start();
		for (int i=20;i<20 ;i++ )
		{
			System.out.println("main:"+i);
			try
			{
				sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}
/*
from run:0
from run:1
from run:2
from run:3
from run:4
from run:5
from run:6
from run:7
from run:8
from run:9
from run:10
from run:11
from run:12
from run:13
from run:14
from run:15
from run:16
from run:17
from run:18
from run:19
*/
