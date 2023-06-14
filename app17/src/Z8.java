class Z8
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		int b1 = test();
		System.out.println("main end:" + b1);
	}
	public static  int test() 
	{
		System.out.println("from test");
		int i;
		return i;
	}
				
}

/* 

 variable i might not have been initialized

*/