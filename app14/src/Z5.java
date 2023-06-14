class Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 0; i <= 5; i++);  //for loop closed here, int i declare in for loop so error
		{
			
			System.out.println("loop body stmt1:" +i);   //even braces not included 
		}
		System.out.println("main end");
	}
}


//cannot find symbol