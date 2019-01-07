public class Main1
{ 
  
    public static int foo(int a)
    { 
    	return a-2;
    } 
    public static short foo(int a, int b)
    {
 
     	return (short)(a + b);
    } 
  
    public static void main(String args[]) 
    {

        System.out.println(foo(1)); 
        System.out.println(foo(1, 2));
        //System.out.println(foo());
    }
}