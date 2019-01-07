import java.util.Scanner;
class L 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter something");
		String s1 = sc.next();
		try
		{
			System.out.println("try begin");
			int i = Integer.parseInt(s1);
			System.out.println("--------");
			int k = i / (i-9);
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
