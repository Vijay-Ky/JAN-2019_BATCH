interface A
{
	void test1();
}
class B implements A
{
	public void test1()
	{
		System.out.println("from test1()");
	}
}
class O 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test1();
		System.out.println("done");
	}
}
