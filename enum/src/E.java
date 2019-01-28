class F
{
	public static void main(String[] args)
	{
		enum E 
		{
			C1,C2,C3,C4;	
		}
		E e1 = E.C4;
		System.out.println(E.C1);
		System.out.println(E.C3);
		System.out.println(e1);
	}
}