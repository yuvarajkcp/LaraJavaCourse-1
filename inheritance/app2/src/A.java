//composition
class  A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class B extends A
{
	void test2()
	{
		System.out.println("B-test2");
		System.out.println(i);
		test1();
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test2();
	}
}
/*
D:\april-batch-lab\inheritance\app2\src>java -cp ../classes B
B-test2
0
A-test1
*/