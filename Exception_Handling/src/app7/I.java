import java.util.Scanner;
class I 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			throw new ArithmeticException();
		}
		System.out.println("continue...");
	}
}
