interface A
{
	void test1();
	void test2();
}
class S implements A 
{
	public void test1()
	{
		System.out.println("S.test1()");
	}
	public void test2()
	{
		System.out.println("S.test2()");
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		s1.test1();
		s1.test2();
		System.out.println("done");
	}
}
