// An example to show that interfaces can 
// have methods from JDK 1.8 onwards 
interface in2 
{ 
    final int a = 10; 
    default void display() 
    { 
        System.out.println("hello"); 
    } 
} 
  
// A class that implements interface. 
class testClass2 implements in2 
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        testClass2 t = new testClass2(); 
        t.display(); 
    } 
} 