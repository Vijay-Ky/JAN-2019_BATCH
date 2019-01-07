class S 
{
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		S();//CTE:compiler considering it as a method calling.
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		S obj1 = new S();
		System.out.println("------------");
		S obj2 = new S(10);
		System.out.println("------------");

	}
}
