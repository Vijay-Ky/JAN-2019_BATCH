class A extends Thread
{
	public void run()
	{
		System.out.println(getName());
	}
	public static void main(String[] args) 
	{
		A t1 = new A();
		t1.start();
		System.out.println("Main Thread");
	}
}
