import java.io.Closeable;
class N implements Closeable
{
	public void close() 
	{
		System.out.println("from close");
	}
}
