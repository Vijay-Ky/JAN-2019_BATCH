package pack2;
import static pack1.A.i;
import static pack1.A.test;
import static pack1.B.j;
import static pack1.B.k;
import static pack1.C.CON1;
import static pack1.C.CON2;
import static pack1.C.CON3;
import static java.lang.System.out;
class Manager2
{
	public static void main(String [] args)
	{
		out.println(i);
		test();
		out.println(j);
		out.println(CON1);
		out.println(CON2);
		out.println(CON3);
	}
}