

public class E
{
	public static void main(String[] args)
	{
		A a1 = new A();
    	a1.start();//O/P will not be in sequence
	//	a1.run();//O/P will be in sequence
		for (int i = 101; i < 200; i++)
		{
			System.out.println("from main" + i);
		}
	}
}
/*
com\lara\E.java:7: error: cannot find symbol
                A a1 = new A();
                ^
  symbol:   class A
  location: class E
com\lara\E.java:7: error: cannot find symbol
                A a1 = new A();
                           ^
  symbol:   class A
  location: class E
2 errors
*/