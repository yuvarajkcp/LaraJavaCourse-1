class U
{     		
	 	static int i;     
	 	public static void main(String[] args) 
	{  
		System.out.println("main:" + i);
		test();
		U.test();  //test();
	}
		public static void test()
	{
		System.out.println("test:" + i);
	}
}

/*
main:0
test:0
test:0
*/


