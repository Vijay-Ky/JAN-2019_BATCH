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
		//some statements
	}
}
class J
{
	
	J(A obj)
	{
	}
	void method1(A obj)
	{
	}
	A method2()
	{
		return null;
	}
	public static void main(String[] agrs)
	{
		A a1 = null;
		G g1 = new G();
	    System.out.println("done");
	}
}
