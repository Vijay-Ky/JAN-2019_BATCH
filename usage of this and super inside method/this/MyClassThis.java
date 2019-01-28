// Program to illustrate this keyword 
// is used to refer current class 
class MyClassThis
{ 
	// instance variable 
	int a = 10; 
	// static variable 
	static int b = 20; 
	void methodThis() 
	{ 
		// referring current class(i.e, class MyClassThis) 
		// instance variable(i.e, a) 
		System.out.println(a); 
		this.a = 100; 
		System.out.println(a); 
		// referring current class(i.e, class ) 
		// static variable(i.e, b) 
		System.out.println(b); 
		this.b = 600; 
		System.out.println(b); 
	} 

	public static void main(String[] args) 
	{ 
		// Uncomment this and see here you get 
		// Compile Time Error since cannot use 
		// 'this' in static context. 
		 //this.a = 700; 
		new MyClassThis().methodThis(); 
	} 
} 
