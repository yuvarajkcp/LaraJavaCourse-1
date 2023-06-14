class Z33
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x;
		test(x = 10);
		System.out.println("main end:" + x);
	}
	public static void test(int i)
	{
		System.out.println("from test:" + i);
	}
}
