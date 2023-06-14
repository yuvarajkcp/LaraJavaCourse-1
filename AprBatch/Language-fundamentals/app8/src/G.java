class G
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main begin:" + i);
		test();
		System.out.println("main end:" + i);
	}
	public static void test()
	{
		int i = 20;
		System.out.println("from test:" + i);
	}
}
