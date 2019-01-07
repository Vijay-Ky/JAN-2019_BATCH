class L//better than K
{
	static void test()//code is moved to test method to achieve the reusability, development wise it is better but security wise not better. 
	{// main method code is moved to test method. 
		System.out.println("1111");
		System.out.println("1111");
		System.out.println("1111");
	}
	public static void main(String [] args)
	{
		test();
		System.out.println("----");
		test();
		System.out.println("----");
		test();
	}
}
