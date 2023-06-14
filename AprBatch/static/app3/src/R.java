class A
{
	static void test()
	{
		System.out.println("from A.test");
	}
}
class B
{
	static void test()
	{
		System.out.println("from B.test");
	}
}
class R 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A.test();
		System.out.println("-----------");
		B.test();
		System.out.println("-----------");
		System.out.println("main end");
	}
}
