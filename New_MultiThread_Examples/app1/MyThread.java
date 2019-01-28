class MyThread extends Thread	//Extending the Thread class
{
	MyThread(String name) //Constructor
	{
		super(name);//Calling superclass Thread's constructor
	}

	public void run() //Entry Point of the new thread.
	{
		System.out.println("Name of NewlyCreatedThread - " + getName()); //Getting the name of this new thread.
		try
		{
			System.out.println(getName()+ " is going to sleep for 3 seconds");
			Thread.sleep(3000);
			System.out.println(getName()+ " awakened and exits"); 
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

	}// run method defintion ends

	public static void main(String... ar)
	{
		MyThread t1 = new MyThread("NewThreadNo:0");
		t1.start(); //starting the new thread, calls run() method automatically
	}
}