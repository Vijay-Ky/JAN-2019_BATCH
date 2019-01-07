class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try(N n1 = new N() ; N n2 = new N()) //JDK 1.7
		{
			System.out.println("from try");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("from finally");
		}
	}
}
/*
1.we can keep closeable type in the try block. this feature introduced
in JDK 1.7
2.can define more than one closeable using ; as seperator
conditions
1.only closeable type can be open
2.all closeable resources is local to try.
3.all closeable resources are acting as final.*/