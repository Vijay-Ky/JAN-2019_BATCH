class Q
{
	Q()
	{
		System.out.println("Q()");
	}
	{
		System.out.println("Q-IIB");
	}
}
class R extends Q
{
	R()
	{
		System.out.println("R()");
	}
	{
		System.out.println("R-IIB");
	}
}
class S extends R
{
	S(int i)
	{
		System.out.println("S(int)");
	}
	{
		System.out.println("S-IIB");
	}
	public static void main(String[]args)
	{
		S s1=new S(90);
		System.out.println("------");
		R r1=new R();
		System.out.println("------");
		Q q1=new Q();
		System.out.println("------");
	}
}