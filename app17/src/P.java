class P 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("main end");
	}
		public static void test() 
	{
		System.out.println("test begin");
		if(true)
		{
			System.out.println("if block");
			return;  //return should be in end of the block
		}
		System.out.println("test end");
	}
}

/*
main begin
test begin
if block
main end
*/