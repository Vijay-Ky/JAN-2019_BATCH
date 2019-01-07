class E
{
	E()
	{
		System.out.println("E()");
	}
	E(int i)
	{ 
		System.out.println("E(int)");
	}
}
class F extends E
{
	F()
	{
		System.out.println("F()");
	}
	F(int i)
	{ 
		System.out.println("F(int)");
	}
	public static void main(String[]args)
	{
		E e1= new E();
		System.out.println("-------");
		E e2= new E(10);
		System.out.println("-------");
		F f1= new F();
		System.out.println("-------");
		F f2= new F(90);
	}
}