//Non-Static Method Creation and Calling
class Q
{
	int i;
	public static void main(String[] args)
	{
		Q q1 = new Q();//only one object creating.
		q1.i=10;
		Q q2=q1;
		System.out.println(q2.i);
		q2.i=20;
		Q q3=q2;
        System.out.println(q3.i);
		System.out.println(q1.i);
	}
}