// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in1 
{ 
	final int a = 10; 
	default void display() 
	{ 
		System.out.println("hello"); 
	} 
	 default void display1() 
	{ 
		System.out.println("hello"); 
	} 
} 

// A class that implements interface. 
class TestClass1 implements in1 
{ 
	// Driver Code 
	public static void main (String[] args) 
	{ 
		TestClass1 t = new TestClass1(); 
		t.display(); 
		t.display1(); 
	} 
} 
