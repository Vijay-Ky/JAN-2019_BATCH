//for the same try any no. of catches can be provided
import java.util.Scanner;
class I 
{
	public static void main(String[] args) 
	{
		System.out.println("enter something");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("------");
			System.out.println("try end");
	
		}
		catch (ArithmeticException ex)
		{
				System.out.println("Arithmetic Exception");
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Number Format Exception");
		}
		System.out.println("main end");
	}
}
