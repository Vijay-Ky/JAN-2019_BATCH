class V extends Thread// same class inherit with Thread class which is contained java.lang package  
{
	public void run()
	{
		for (int i=0;i<1000 ;i++ )
		{
			System.out.println("run:"+i);

		}
	}
	public static void main(String[] args) 
	{
		V v1 = new V();
		
		v1.start();

		for (int i=1000;i<2000 ;i++ )//first execution  start with main methods..
		{
			System.out.println("main:"+i);
		}

	}
}
