enum P 
	{
		CON1,CON2,CON3;
	}
class Q
{
	public static void main(String[] args)
	{
		P p1=P.valueOf("CON2");
		System.out.println(p1);
		P p2=P.valueOf("CON3");
		System.out.println(p2);
		P p3=P.valueOf("CON4");
		System.out.println(p3);
	}	
}