class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10 / 0;
		System.out.println("main end");
	}
}
/*
1.for abnormal condition arithmetic exception object will be raised.
2.rised exception object should be handled to succesfully continue.
*/
