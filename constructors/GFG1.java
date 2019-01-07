import java.io.*; 
  
class Geek 
{ 
    // data members of the class. 
    String name; 
    int id;
  
    // contructor would initialized data members 
    // with the values of passed arguments while 
    // object of that class created. 
    Geek(String name, int id) 
    { 
        this.name = name; 
        this.id = id; 
    } 
} 
  
class GFG1 
{ 
    public static void main (String[] args) 
    { 
        // this would invoke parameterized constructor. 
        Geek geek1 = new Geek("adam", 1); 
        System.out.println("GeekName :" + geek1.name + 
                           " and GeekId :" + geek1.id); 
    } 
} 