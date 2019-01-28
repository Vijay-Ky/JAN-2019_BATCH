class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Object obj = new Object();
		System.out.println(obj instanceof A);
		A e1 = (A) obj;
		System.out.println("main end");
	}
}
