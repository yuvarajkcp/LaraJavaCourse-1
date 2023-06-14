class A
{
	static void test()
	{
		System.out.println("from A.test");
	}
}
class Q 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		//test();
		A.test();
		System.out.println("main end");
	}
}
