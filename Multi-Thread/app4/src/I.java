class H implements Runnable //Runnable is a interface which is available to java  
{
	public void run()// here we have to mwke the run class which we can start..
	{
		for (int i=0;i<5 ;i++ )
		{
			System.out.println("from run:"+i);
		}
	}
}
class I
{

	public static void main(String[] args) 
	{
		H h1=new H();
		Thread t1=new Thread(h1);// here we make the object of the Thread then we supply the object of the class to the runnable interface
		t1.start();// here we call the start the run method of h1
		for (int i=5;i<10 ;i++ )
		{
			System.out.println("from main:"+i);
		}
		
	}
}
// runnable attribute is assign to object of the class
/*
from main:5
from main:6
from run:0
from main:7
from run:1
from main:8
from run:2
from main:9
from run:3
from run:4

*/