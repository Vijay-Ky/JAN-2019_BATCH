class E
{
	void test()
	{
		System.out.println("from E-test");
	}
}
class F extends E
{
	void test()
	{
		System.out.println("from F-test");
	}
}
class G extends F
{
	void test()
	{
		System.out.println("from G-test");
	}
}/////to achive polymorphism  method overriding,auto upcasting
class Manager3
{
	public static void main(String[]args)
	{
		E e1 = new E();
		F f1 = new F();
		G g1 = new G();
		E e2 = new G();
		E e3 = new F();
		E[] x = new E[5];
		x[0]=e1;
		x[1]=f1;
		x[2]=g1;
		x[3]=e2;
		x[4]=e3;
		for(int i=0;i<x.length;i++)
		{
			x[i].test();
		}
	}
}