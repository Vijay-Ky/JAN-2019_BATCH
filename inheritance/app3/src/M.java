class M
{
	M()
	{
		System.out.println("M()");
	}
	{
		System.out.println("IIB1");
	}
	static 
	{
		System.out.println("M-SIB");
	}
	M(int i)
	{
		this();
		System.out.println("M(int)");
	}
}
class N extends M
{
	N()
	{
		System.out.println("N()");
	}
	{
		System.out.println("N-IIB1");
	}
	static 
	{
		System.out.println("N-SIB");
	}
	N(int i)
	{
		super(i);
		System.out.println("N(int)");
	}
	{
		System.out.println("N-IIB2");
	}
}
class O extends N
{
	O()
	{
		this(90);
		System.out.println("O()");
	}
	O(int i)
	{
		super(90);
		System.out.println("O(int)");
	}
	{
		System.out.println("O-IIB1");
	}
	static 
	{
		System.out.println("O-SIB");
	}
}
class P
{
	static 
	{
		System.out.println("P-SIB");
	}
	public static void main(String[]args)
	{
		O o1=new O();
		System.out.println("------");
		M m1=new M();
		System.out.println("------");
		N n1=new N(20);
		System.out.println("------");
	}
}
class Q
{
	static 
	{
		System.out.println("Q-SIB");
	}
	public static void main(String[]args)
	{
		N n1=new N();
		System.out.println("------");
		M m1=new M(20);
		System.out.println("------");
		O o1=new O(80);
		System.out.println("------");
	}
}