class P
{ 
	P()
	{
		this.i = 10;
	}

	final int i;
	public static void main(String[] args)
	{
		final P p1 = new P();
		 //p1.i = 20;
		System.out.println(p1.i);
		//p1 = p1;
	}
}
