enum V
{
	C1,C2(90),C3,C4,C5,C6;
	V()
	{
		System.out.println("V()");
	}
	V(int i)
	{
		System.out.println("V(int)");
	}
}
class W
{
	public static void main(String[] args)
	{
		V v1 = V.C2;
		System.out.println(v1);
	}	
}