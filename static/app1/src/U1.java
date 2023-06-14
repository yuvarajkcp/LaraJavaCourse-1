class U1
{     		
	 	static int i;     
	 	public static void main(String[] args) 
	{  
			int i = 10;
		System.out.println("main:" + U1.i);
		System.out.println("main:" + i);
		test();
		U.test();
	}
		public static void test()
	{
		System.out.println("test:" + i);
	}
}

/*
main:0
main:10
test:0
test:0
*/
