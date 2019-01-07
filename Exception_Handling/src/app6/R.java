//any method can overrid a method without throws keyword
class R 
{
	void test1() throws ClassNotFoundException 
	{

	}
}
class S extends R
{
	void tes1() throws CloneNotSupportedException
	{	

	}
}
