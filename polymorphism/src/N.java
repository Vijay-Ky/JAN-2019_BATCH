class N
{
	public static void main(String[]args)
	{
		System.out.println("from N");
	}
	static
	{
		System.out.println("SIB-N");
	}
}
class O extends N
{
	static
	{
		System.out.println("SIB-O");
	}
}