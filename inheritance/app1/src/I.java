class I
{
	static int m;
	int n;
	static void test1()
	{
		System.out.println("from-test1");
	}
	void test2()
	{
		System.out.println("from-test2");
	}
}

class J extends I
{
	public static void main(String[] args) 
	{
		System.out.println(J.m);
		J.test1();

		J ref = new J();
		System.out.println(ref.n);
		ref.test2();

	}
}
/*
D:\april-batch-lab\inheritance\src>javac -d ../classes I.java

D:\april-batch-lab\inheritance\src>java -cp ../classes J
0
from-test1
0
from-test2
*/
