class A
{
	static 
	{
		System.out.println("A-SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
}
class C extends B
{
	static
	{
		System.out.println("C-SIB");
	}
}
class D
{
	public static void main(String[]args)
	{
		B b1=new B();
		System.out.println("done");
	}
}
class E
{
	public static void main(String[]args)
	{
		C c1=new C();
		System.out.println("done");
	}
}
class F
{
	public static void main(String[]args)
	{ 
		A a1 = new A();
		System.out.println("done");
	}
}