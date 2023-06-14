class A
{
	static int i;
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
	static int j;
	static void test()
	{
		System.out.println("from B.test");
	}
	static
	{
		System.out.println("from B.SIB");
	}
}
class U
{
	static
	{
		System.out.println("from U.SIB");
	}	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("-----------");
		System.out.println(B.j);
		A.test();
		System.out.println("-----------");
		B.test();
		System.out.println("-----------");
		System.out.println("-----------");
		A.test();
		System.out.println("-----------");
		B.test();
		System.out.println("main end");
	}
}
