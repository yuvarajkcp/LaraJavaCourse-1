class F 
{
	void test1()
	{
		
	}
	static
	{
		test1();
	}
}
/* error: non-static method test1() cannot be referenced from a static context
                test1();
                ^

*/