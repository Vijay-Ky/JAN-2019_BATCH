interface A
{
}
interface B extends A
{
}
class C20
{
}
class C22 extends C20 implements A,B 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
