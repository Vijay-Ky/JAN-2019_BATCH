import java.util.Scanner;
class K 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			throw new AgeIsNegativeException();
		}
		System.out.println("continue...");
	}
}
