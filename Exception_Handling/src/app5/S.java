import java.text.*;
class S 
{
	public static void main(String[] args) 
	{
		DateFormat df = null;
		try
		{
			df.parse("");
		}
		catch (ParseException ex)
		{
		}
		System.out.println("Hello World!");
	}
}
