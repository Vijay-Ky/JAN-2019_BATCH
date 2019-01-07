class Parent 
{ 
    // Can't be overridden 
    final void show()
    {
    	System.out.println("parent"); 
    } 
} 
  
class Child extends Parent 
{ 
    // This would produce error 
    //void show() {  } 
    Child c1 = new Child();
    c1.show();
} 