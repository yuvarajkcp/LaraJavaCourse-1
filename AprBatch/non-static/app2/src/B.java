class B
{
	B()
	{
		System.out.println("B()");
	}
	public static void main(String[] args)
	{	
		B b1 = new B();
		System.out.println("-----");
		B b2 = new B();
		System.out.println("-----");
	}
}
//for each and every object creation, the available constructor of that class will be executing.