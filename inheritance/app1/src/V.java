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
class V extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------------");
		A a2 = new A();
	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes V.java

D:\april-batch-lab\inheritance\src>java -cp ../classes V
A-IIB
A()
--------------
A-IIB
A()

*/