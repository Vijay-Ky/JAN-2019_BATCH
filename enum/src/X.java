class X
{
	enum A 
	{
		CON(100),TEST(200);
		A(int i)
		{
			System.out.println("A(int):"+i);
		}
	}
	public static void main(String[] args)
	{
		A a1 =A.TEST;
		System.out.println(a1);
	}	
}