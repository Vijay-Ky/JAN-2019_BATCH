package pack1;
class S
{
	private S()
	{
	}
	S(int i)
	{
	}
}
class T extends S
{
	T()
	{
		super(20);
	}
	public static void main(String[]args)
	{
		System.out.println("done");
	}
}
