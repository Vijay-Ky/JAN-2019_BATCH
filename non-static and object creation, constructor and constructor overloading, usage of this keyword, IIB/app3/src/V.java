class V//CTE:Recursive invocation.
{
	V()
	{
		this();
		System.out.println("V()");
	}
}
