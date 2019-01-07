//compile command-javac -d ../classes com/lara/X.java
//Run command-cd ../classes
//again- java X
//cs & run success
class X 
{
	
	public static void main(String[] args) throws InterruptedException // here we use the thorows Exception
	{
		for (int i=0;i<20 ;i++ )
		{
		
		System.out.println("main:"+i);
		Thread.sleep(2000);// here we use the sleep method of thread which in method value we pass the no. of the milliseconds..
		}
	}
}
//CS
/*
main:0
main:1
main:2
main:3
main:4
main:5
main:6
main:7
main:8
main:9
main:10
main:11
main:12
main:13
main:14
main:15
main:16
main:17
main:18
main:19
*/