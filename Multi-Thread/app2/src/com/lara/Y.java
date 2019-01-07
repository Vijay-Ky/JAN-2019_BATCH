class Y 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<20 ;i++ )
		{
			System.out.println("main"+i);
			try//here we can use try and catch to handle the ecxeption
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}
}

//CS
/*
main0
main1
main2
main3
main4
main5
main6
main7
main8
main9
main10
main11
main12
main13
main14
main15
main16
main17
main18
main19

*/