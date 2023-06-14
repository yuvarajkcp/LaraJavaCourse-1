class J 
{
	void test1()  //non-static
	{
		System.out.println("from test1");	
	}
	static void test2() //static
	{ 
		J obj = new J();
		obj.test1(); //by using obj reference we are accessing non-static test()
		System.out.println("from test2");	
	}
}


//compile successfully

//non-static test1 method is loading while creating object to J class in the test2 static method