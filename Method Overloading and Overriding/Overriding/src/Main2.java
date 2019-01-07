// A Simple Java program to demonstrate  
// Overriding and Access-Modifiers 
  
class Parent 
{ 
    // private methods are not overridden 
    public void m1()
    { 
        System.out.println("From parent m1()");
    } 
      
    protected void m2()
    { 
        System.out.println("From parent m2()");
    } 
} 
  
class Child extends Parent 
{ 
    // new m1() method 
    // unique to Child class 
    /*public void m1()
    { 
        System.out.println("From child m1()");
    }*/ 
      
    // overriding method 
    // with more accessibility 
    //@Over
      
} 
  
// Driver class 
class Main2
{ 
    public static void main(String[] args) 
    {   
    
        Child obj2 = new Child(); 
        obj2.m1();
        obj2.m2(); 
    } 
} 