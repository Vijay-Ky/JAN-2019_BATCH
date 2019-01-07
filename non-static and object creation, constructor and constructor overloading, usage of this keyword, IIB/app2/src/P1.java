//154.Constructors
class P1
{
	/*P()
	{
			//this(10,20);
			System.out.println("P()");
	}
	P(int i,int j)
	{
		System.out.println("P(int,int)");
	}*/
	 void test1()
	 {
	 	this.test2(10,20);
	 	System.out.println("test1()");	 		 	this.test2(10,20);
	 	this.test2(10,20);
	 }
	 void test2(int i, int j)
	 {
	 	System.out.println("test2(int, int)");
	 }
	
	public static void main(String[] args) 
	{
		P1 p1 = new P1();
		p1.test1();
		//System.out.println("-------");
		//P1 p2 = new P1(1,2);
		//System.out.println("-------");
	}
}
