//Non-Static Method Creation and Calling
class P
{
	int i;
	static void test(P obj)//every argument is local to current method
	{
		System.out.println("test:" + obj.i);s
	}
	public static void main(String[] args)
	{
		P p1 = new P();
		System.out.println("main:" + p1.i);//0
		p1.i = 10;
		test(p1);
	}
}