class  D
{
	 void test1() 
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		test1();
		System.out.println("from test2");
	}
}
/*error: non-static method test1() cannot be referenced from a static context
                test1();
				*/