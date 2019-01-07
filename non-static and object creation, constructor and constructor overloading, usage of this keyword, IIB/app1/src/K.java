//Non-Static Method Creation and Calling
class K
{
	int i;
	static
	{	
		K k1 = new K();
		System.out.println(k1.i);
}
}