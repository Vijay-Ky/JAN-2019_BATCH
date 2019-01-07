class E
{
	public static void main(String[] args)
	{
		final E e1 = new E();
		E e2 = new E();
		e1 = e2;
		System.out.println("done");
	}
}
