
public class A
{
    A()
    {
         System.out.println("from A");
    }
    
    
}
class B extends A
{
    public static void main(String[] args)
    {
        A a1 = new A();
        System.out.println("from B main");
    }
}
