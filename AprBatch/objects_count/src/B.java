class B 
{
	static int p = 10;
	public static void main(String[] args) 
	{
		System.out.println("a: " + p);
		System.out.println("b: " + B.p);
		B obj1 = new B();
		B obj2 = new B();
		B obj3 = new B();
		B obj4 = new B();
		//compiler replacing from reference variable to class name
		//can use reference of same class type
		System.out.println("c: " + obj1.p);
		System.out.println("d: " + obj2.p);
		System.out.println("e: " + obj3.p);
		System.out.println("f: " + obj4.p);
	}
}
//all the static members of a class will be shared by each and every object of that class. by using any reference of any object we can access any static member. 
//by using any reference of any object we can able to access or modify the static member.
//only the original static member will be getting modified. because static members gets loaded only once not again and again.