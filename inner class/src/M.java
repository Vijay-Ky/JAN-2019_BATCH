class M //best way to develop code using local inner class
{// achieving reusability without going outside main method. Most secured. 
	public static void main(String [] args)//again and again using in the same code, develop such codes in local inner class.
	{
		class A
		{
			void test()
			{
				System.out.println("1111");
				System.out.println("1111");
				System.out.println("1111");
			}
		}
		A a1=new A();
		a1.test();
		System.out.println("----");
		a1.test();
		System.out.println("----");
		a1.test();
	}
}
// a method cannot be develop in constructor, IIB,SIB, in any of the defination block
// inside a constructor, you want to use a code again and again, go for local inner class.
//method cannot be develop inside another method straightaway. go for local inner class.
