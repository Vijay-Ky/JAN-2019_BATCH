class L
{
	static int i;
	static
	{
		System.out.println("from L-SIB");
	}
}
class M extends L
{
	static
	{
		System.out.println("from M-SIB");
	}
}
class Manager6
{
	public static void main(String[]args)
	{
		System.out.println("--------");
		System.out.println(M.i);
		System.out.println("--------");
	}
}