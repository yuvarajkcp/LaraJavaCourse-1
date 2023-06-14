class B 
{
	void test()  //non-static
	{
		
	}
	public static void main(String[] args) 
	{ 
		test();
		System.out.println("done");
	}
}
/*non-static method test() cannot be referenced from a static context
                test();
		
				*/