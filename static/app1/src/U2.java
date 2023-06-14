class U2
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

class V
{     		     
	 	public static void main(String[] args) 
	{  
		System.out.println("main:" + U2.i);
		U2.test();
	}}

	/*
	main:0
main:10
test:0
test:0
*/
