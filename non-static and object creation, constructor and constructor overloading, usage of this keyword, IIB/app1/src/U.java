//Non-Static Method Creation and Calling
class U
{
	int i;
	static U test()
	{
			U u1 = new U();
			u1.i = 20;
			System.out.println(u1.i);
			return u1;
	}
	public static void main(String[] args)
	{
		U obj = test();
		obj.i=30;
		System.out.println(obj.i);
	}
}