class H
	{
		class I
		{
		}
		static class J
		{
		}
	}
	class Manager
	{
		public static void main(String [] args)
		{
		/*outer ==>>*/H.I /*<==inner*/ obj1=null;//data type purpose h.i
		H.J obj2=null;//datatype purpose h.j
		obj1=new H().new I();//to create object to I,Use H reference or object of H
		H h1=new H();
		obj1=h1.new I();//by h1 reference of H accessing I.
		obj2=new H.J();//H.J object is creating to J class not to H class.
		System.out.println("done");
	}
}