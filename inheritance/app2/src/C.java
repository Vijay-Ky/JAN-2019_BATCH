class C
{
	C(int i)
	{
		System.out.println("C(int)");
	}
}
class D extends C
{
	D(int i)
	{ 
		super(i);
		System.out.println("D(int)");
	}
	D()
	{ 
		super(10);
		System.out.println("D()");
	}
	public static void main(String[]args)
	{
		C c1= new C(10);
		System.out.println("-------");
		D d1= new D(20);
		System.out.println("-------");
		D d2= new D();
		System.out.println("-------");
	}
}