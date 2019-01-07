class X
{
}
class Y extends X
{
	Y(int i)
	{
		System.out.println("Y(int)");
	}
	public static void main(String[]args)
	{
		Y y1= new Y(10);
		System.out.println("-------");
	}
}