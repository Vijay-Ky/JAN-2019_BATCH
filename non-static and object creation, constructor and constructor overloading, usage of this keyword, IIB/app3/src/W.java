class W//Constructor executes for every object creation. 
{		//SIB executes only once when class loading.
	static
	{
		System.out.println("SIB");
	}
	W()
	{
		System.out.println("W()");
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("-----------");
		W w2 = new W();
		System.out.println("-----------");
	}
}
