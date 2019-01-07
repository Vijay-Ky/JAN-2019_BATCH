package pack2;
import static pack1.C.*;// (class, interface, enum should be done from regular import)
import pack1.C;
class Manager10
{
	public static void main(String [] args)
	{
		System.out.println(CON1);
		System.out.println(CON2);
		System.out.println(CON3);
		System.out.println(C.CON3);
		C c1=C.CON1;
	}
}