class N
{
	 final int i = 10;
	public static void main(String[] args)
	{
		N n1 = new N();
		n1 = new N();
		final N n2 = n1;
		n2 = n1;
		System.out.println("done");
		//System.out.println(n1.i);
	}
}