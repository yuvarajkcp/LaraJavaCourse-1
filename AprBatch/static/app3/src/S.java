class A
{
	static void test()
	{
		System.out.println("from A.test");
	}

	static
	{
		System.out.println("from A.SIB");
	}
}
class B
{
	static void test()
	{
		System.out.println("from B.test");
	}
	static
	{
		System.out.println("from B.SIB");
	}
}
class S 
{
	static
	{
		System.out.println("from S.SIB");
	}	
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
