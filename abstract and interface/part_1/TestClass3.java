// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in12 
{ 
	final int a = 10; 
	default void display() 
	{ 
		System.out.println("hello"); 
	} 
	default void display1() 
	{	
		System.out.println("hello displa1"); 
	}
} 
// A class that implements interface. 
class TestClass3 implements in12 
{ 
	// Driver Code 
	public static void main (String[] args) 
	{ 
		TestClass3 tc3 = new TestClass3();
		tc3.display1(); 
	} 
} 
