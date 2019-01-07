class A
{
    public static void display()
	{
        System.out.println("Inside static method of superclass");
    }
}

class B extends A
{
	/*public void show()
    {
        display();
    }*/

    public static void display()
	{
        System.out.println("Inside static method of this class");
    }
}

public class Test
{
    public static void main(String[] args)
	{
        B b = new B();
        b.display();

        A a = new B();
        a.display();
    }
}