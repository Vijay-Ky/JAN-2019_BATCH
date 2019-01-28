class J
{
	J()
	{
		System.out.println("J()");
	}
}
class K extends J
{
	K()
	{
		System.out.println("K()");
		super();
	}
	public static void main(String[]args)
	{
		System.out.println("done");
	}
}