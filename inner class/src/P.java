class P
{
	public static void main(String [] args)
	{
		class A//static keywords cannot be used inside any of the defination blocks.
		{
			static int i;// inner class itself should be declared as static to use static members inside it.
		}
		System.out.println("done");
	}
}
//to use local variable in local inner class, it should be final till jdk 1.7
//any local variable can be used in local inner classfrom jdk 1.8 
//in main method we cannot use static keywords. inside IIB, SIB , constructor body static keywords cannot use.\
// it can be used only for members of the class.
//A cannot be declared as static.
//outer class cannot be static but inner class only can be static.
//but not the local inner class. 