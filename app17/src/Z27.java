class Z27
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 			
		System.out.println("main end:");  
	}
	public static  void test(int i) 
	{
		double i;   //i is local to test method so same name is not possible
		System.out.println("from test:");
	}
				
}


// variable i is already defined in method test(int)