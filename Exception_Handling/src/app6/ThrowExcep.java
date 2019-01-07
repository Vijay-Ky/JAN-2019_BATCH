// Java program that demonstrates the use of throw 
class ThrowExcep 
{ 
	static void fun() 
	{ 
		try
		{ 
			throw new NullPointerException("demo"); 
		} 
		catch(ArithmeticException ex) 
		{ 
			System.out.println("Caught inside fun()."); 
			//return;
			//throw e; // rethrowing the exception 
		}
	} 

	public static void main(String args[]) 
	{ 
		try
		{ 
			fun(); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.println("Caught in main."); 
		} 
	} 
} 
