class O
{
	public static void main(String [] args)
	{
		int i=10;// only final variables were allowed till jdk 1.7
		final int j=20;
		class A
		{
			void test()
			{
				//System.out.println(i); till jdk 1.7 it was not allowed because i is non final
				System.out.println(j);//-source 1.7 O.java (jdk compiler)
			}//but from 1.8 onwards any local variables can be used in local inner class.
		}
		System.out.println("done");
	}
}