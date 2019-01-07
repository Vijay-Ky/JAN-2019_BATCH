class O
{
	enum Test 
	{
		C1,C2,C3,C4;
	}
	public static void main(String[] args)
	{
		Test t1=Test.C2;
		Test t2=Test.C4;
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		int i= Test.C3.ordinal();
		System.out.println(i);
	}	
}