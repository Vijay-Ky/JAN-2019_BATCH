//Non-Static Method Creation and Calling
class B
{
	void test()
	{
	}
	public static void main(String[] args) 	
	{
		test();//non-static member cant be used 
		//in any of the static memer without reference variable.
		System.out.println("Hello World!");
	}
}
