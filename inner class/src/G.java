class G
{
	class H
	{
	}
	static class I
	{
	}
	public static void main(String [] args)
	{
		
		
		H h1=null;// uses is a datatype purpose
		I i1=null;
		//h1= new H():
		i1=new I();
		h1=new G().new H();//compile sucessfully, because of G type refrence. 
		G g1=new G();
		h1=g1.new H();
		i1=new G.I();//object is creating to I
				System.out.println("done");
	}
}
