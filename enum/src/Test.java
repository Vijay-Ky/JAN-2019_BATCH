enum Month
{
	JAN,FEB,MAR,DEC,AUG;
}
class Test 
{
	public static void main(String[] args) 
	{
		Month m1 = Month.DEC;
		switch(m1)
		{
			case JAN: System.out.println("JAN");
			break;

			case FEB: System.out.println("FEB");
			break;

			case MAR: System.out.println("MAR");
			break;

			case AUG: System.out.println("DEC");
			break;

			default : System.out.println("Not listed");
		}
	}
}
