class  A
{
	A()
	{
		//super()
		//IIB
		System.out.println("A()");
	}
	A(int i)
	{
		//super()
		//IIB
		System.out.println("A(int)");
	}
	{
		System.out.println("A-IIB");
	}
}
class B extends A
{
	B()
	{
		//super();
		//IIB
		System.out.println("B()");
	}
	B(int i)
	{
		this();
		//IIB
		System.out.println("B(int)");
	}
	{
		System.out.println("B-IIB1");
	}
	{
		System.out.println("B-IIB2");
	}
}
class C extends B
{
	C()
	{
		super(90);
		//IIB
		System.out.println("C()");
	}
	{
		System.out.println("C-IIB");
	}
	C(int i)
	{
		this();
		System.out.println("C(int)");
	}
}
class Y
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------------");
		B b1 = new B();
		System.out.println("--------------");
		A a2 = new A(20);
		System.out.println("--------------");
		B b2 = new B(40);
		System.out.println("--------------");
		C c1 = new C();
		System.out.println("--------------");
		C c2 = new C(10);
		System.out.println("--------------");
	}
}
/*

D:\april-batch-lab\inheritance\src>javac -d ../classes Y.java

D:\april-batch-lab\inheritance\src>java -cp ../classes Y
A-IIB
A()
--------------
A-IIB
A()
B-IIB1
B-IIB2
B()
--------------
A-IIB
A(int)
--------------
A-IIB
A()
B-IIB1
B-IIB2
B()
B(int)
--------------
A-IIB
A()
B-IIB1
B-IIB2
B()
B(int)
C-IIB
C()
--------------
A-IIB
A()
B-IIB1
B-IIB2
B()
B(int)
C-IIB
C()
C(int)
--------------
*/