// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in12 
{ 
	final int a = 10; 
	static void display() 
	{ 
		System.out.println("hello"); 
	} 
} 

// A class that implements interface. 
class TestClass3 implements in12 
{ 
	// Driver Code 
	public static void main (String[] args) 
	{ 
		in12.display(); 
	} 
} 
