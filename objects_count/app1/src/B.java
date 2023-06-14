class B 
{
	static int p = 10;
	public static void main(String[] args) 
	{
		System.out.println("a: "+ p);
		System.out.println("b: "+ B.p);
		B obj1 = new B();
		B obj2 = new B();
		B obj3 = new B();
		B obj4 = new B();
		System.out.println("c: "+ obj1.p);
		System.out.println("d: "+ obj2.p);
		System.out.println("e: "+ obj3.p);
		System.out.println("f: "+ obj4.p);
	}
}
/*
all the static members of a class will be shared by each and every object of a class

by using reference of any object we can accesss any static member

by using any reference of any object we can able to access or modify the static memory

only the original static member will be getting modifed, because static members get loaded once not again and again
a: 10
b: 10
c: 10
d: 10
e: 10
f: 10


*/