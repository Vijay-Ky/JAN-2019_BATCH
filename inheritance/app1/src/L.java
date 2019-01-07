class L
{
	L()
	{
		System.out.println("L()");
	}
}
class M extends L
{
	M()
	{
		System.out.println("M()");
	}
}
class N extends M
{
	N()
	{
		System.out.println("N()");
	}
}
class O
{
	public static void main(String[]args)
	{
		L obj1= new L();
		System.out.println("-------");
		M obj2=new M();
		System.out.println("-------");
		N obj3=new N();
		System.out.println("-------");
	}
}