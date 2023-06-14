class Z20
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(200);
		System.out.println("main end:");
	}
	public static void test(int i)
	{
		System.out.println("from test:" + i);
		i = 30;
		System.out.println("from test:" + i);
	}
}
