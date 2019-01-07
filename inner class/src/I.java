class I
{
	public static void main(String [] args)
		{
			class A //local inner classes, it is not visible outside main method, visible inside main method.
			{
				int i=10;// in any of the method local inner can be develop.
			}
			A a1= new A();// creating object to A
			System.out.println(a1.i);// accessing a1.i
			a1.i=20;
			System.out.println(a1.i);// again accessing a1.i
	}
}
