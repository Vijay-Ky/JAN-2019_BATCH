class W 
{
	
	public static void main(String[] args) 
	{
		for (int i=0;i<20 ;i++ )
		{
		
		System.out.println("main:"+i);
		Thread.sleep(2000);// here we use the sleep method of thread which in method value we pass the no. of the milliseconds..
		}
	}
}
// here we get the Exception error on compile time  
/*
F:\core_java\multi-thread\app2\src>javac -d ../classes com/lara/W.java
com\lara\W.java:10: error: unreported exception InterruptedException; must be ca
ught or declared to be thrown
                Thread.sleep(2000);// here we use the sleep method of thread whi
ch in method value we pass the no. of the milliseconds..
                            ^
1 error
*/