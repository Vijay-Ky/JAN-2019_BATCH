class M
{
	enum En 
	{
		C1,C2,C3,C4,C5;
	}
	public static void main(String[] args)
	{
		En e1=M.En.C2;
		System.out.println(e1);
		En e2=En.C3;
		System.out.println(e2);
	}	
} 