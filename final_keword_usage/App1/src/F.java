class F
{
	public static void main(String[]args)
	{
		F f1 = new F();
		final F f2 = new F();
		final F f3 = new F();
		final F f4 = new F();
		final F f5 = new F();
		f2 = f1;
		System.out.println("done");
	}
}
