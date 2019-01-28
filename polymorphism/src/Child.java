class Parent
{
	static public void work()
	{
		System.out.println("Parent is under retirement from work.");
	}
}
class Child extends Parent
{
	static public void work()
	{
		System.out.println("Child has a job");
		System.out.println(" He is doing it well");
	}
	public static void main(String argu[])
	{
		Parent p1 = new Child();
		p1.work();
	}
}