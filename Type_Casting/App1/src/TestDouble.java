import java.text.DecimalFormat;

public class TestDouble
{
	public static void main(String[] args)
	{
		DecimalFormat df2 = new DecimalFormat(".#");
		double input = 32.123456;
		System.out.println("double : " + input);
		System.out.println("double : " + df2.format(input));	
	}	
}