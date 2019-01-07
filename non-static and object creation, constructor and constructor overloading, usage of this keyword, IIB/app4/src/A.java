class A //inside a class any no. of constructors can be created. 
{		
	A()
	{
		System.out.prinln("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("---------");
		A a2 = new A(10);
		System.out.println("---------");
	}
}
