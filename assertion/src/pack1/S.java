package pack1;
public class S
{
	public void test(int i)
	{
		assert i>10;//inappropriate
		//some stmts
	}
	public static void  main(String[] args)
	{
		assert args[0]=="abc";//inappropriate
	}
	int j;
	void test1()
	{
		assert test2()>10;//inappropriate
	}
	int test2()
	{
		j=10;
		return 20;
	}
	void test3
	{
		int x=4,y;
		switch(x)
		{
			case 1:y=1;
			case 2:y=10;
			case 3:y=12;
			case 4:y=15;
			default:assert false;//inappropriate
		}
	}
}
	
}