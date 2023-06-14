//single inheritance
class C 
{
	void test1()
	{
		System.out.println("from test1");
	}
}

class D extends C
{
	void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args) 
	{
		D d1 = new D();   //C c1 = new C();
		d1.test1();			//c1.test1();   execute
		d1.test2();			//c2.test2();   compile error
	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes C.java

D:\april-batch-lab\inheritance\src>java -cp ../classes D
from test1
from test2
																
*/