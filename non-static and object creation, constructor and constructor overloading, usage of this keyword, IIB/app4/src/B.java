class B//  
{		
	B()
	{
		System.out.prinln("B()");
	}
	{
		System.out.println("IIB");//creating without any name or keyword.
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("---------");
		B b2 = new B();
		System.out.println("---------");
	}
}
