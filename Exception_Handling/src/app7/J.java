import java.util.Scanner;
class J 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			throw new ArithmeticException("age should be > 0");
		}
		System.out.println("continue...");
	}
}
