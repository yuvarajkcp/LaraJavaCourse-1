class P1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		System.out.println("main end");
	}
		public static int test() 
		{
		System.out.println("test begin");
		if(true)
		{
			System.out.println("if block");
			return 20;  //return should be in end of the block
		}
		System.out.println("test end");
		return 10;
	}
}
/*
main begin
main end
*/