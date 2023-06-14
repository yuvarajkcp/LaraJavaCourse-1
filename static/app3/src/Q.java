 class A2
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
		System.out.println("main begin" ); 
		test();
		System.out.println("main end" ); 
	}
}

/*
 error: cannot find symbol
                test();
                ^
*/

//in Q class der is no test method