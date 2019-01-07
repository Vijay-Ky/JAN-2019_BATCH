class S
{
	S()
	{
		System.out.println("S()");
	}
}
class R extends S
{
	R()
	{
		//super();
		System.out.println("R()");
	}
}
class T extends R
{
	T()
	{
		System.out.println("T()");
	}
}
class U
{
	public static void main(String[]args)
	{
		T t1= new T();
		System.out.println("-------");
		R r1=new R();
		System.out.println("-------");
		S s1=new S();
		System.out.println("-------");
	}
}