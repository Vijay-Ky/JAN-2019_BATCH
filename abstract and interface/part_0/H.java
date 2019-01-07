abstract class A 
{
	abstract void test1();
	void test2()
	{
		System.out.println("from test2");
	}
}
class G extends A
{
	void test1()
	{
		System.out.println("from G");
		//some statement
	}
}
class H
{
	public static void main(String[] agrs)
	{
		//A a1 = new A();
		G g1 = new G();
	    System.out.println("done");
	    g1.test1();
	}
}
