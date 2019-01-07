class Z
{
	enum B
	{
		CON1(10),CON2(30),CON4(50);
		int i;
		B(int i)
		{
			this.i=i;
		}
	}
	public static void main(String[] args)
	{
		B b1 =B.CON4;
		System.out.println(b1);
		System.out.println(b1.i);
		B b2 =B.CON2;
		System.out.println(b2);
		System.out.println(b2.i);
	}	
}