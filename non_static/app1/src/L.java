class L 
{
	void test()
	{
		System.out.println("from test1");	
	}
	static
	{
		L obj = new L();
		obj.test();
	}
}

//compile successfully
