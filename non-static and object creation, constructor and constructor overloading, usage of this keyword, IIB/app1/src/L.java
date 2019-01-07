//Non-Static Method Creation and Calling
class L
{
	void test1()
	{
		System.out.println("from test1");
	}
	static
	{	
		L obj = new L();
	}
}