//Constructors
class J
{
	J()
	{
		System.out.println("J()");
	}
	J(int i)
	{
		System.out.println("j(int)");
	}
	public static void main(String[] args) 
	{
		J j1 = new J();
		System.out.println("-------");
		J j2 = new J(20);
		
		System.out.println("-------");
		J j3 = new J();
		System.out.println("-------");
		J j4 = new J(50);
		
		System.out.println("-------");
	}
}
