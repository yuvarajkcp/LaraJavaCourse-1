class  A
{
	A()
	{
		//super()
		//IIB
		System.out.println("A()");
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
		System.out.println("B()");
	}
	{
		System.out.println("B-IIB1");
	}
	{
		System.out.println("B-IIB2");
	}
}
class W 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------------");
		A a2 = new A();
		System.out.println("--------------");
		B b1 = new B();
		System.out.println("--------------");
		B b2 = new B();
		System.out.println("--------------");
	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes B.java

D:\april-batch-lab\inheritance\src>java -cp ../classes W
A-IIB
A()
--------------
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
A()
B-IIB1
B-IIB2
B()
--------------
*/.