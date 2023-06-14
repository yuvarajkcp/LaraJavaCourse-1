class Z12
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String b1 = test1();
		System.out.println("main end:" + b1);
		System.out.println(test2());
	}
	public static String test1()
	{
		System.out.println("from test1");
		return "Hello";
	}

	static Z12 test2()
	{
		//Z12 z1 = null;
		return new Z12();
	}
}
/*
	derived datatype
	----------------
	1. all cleaases
	2. all interface
	3. all enums
*/

