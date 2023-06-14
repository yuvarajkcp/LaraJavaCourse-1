class U
{
	static int i;

	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main:" + U.i);
		System.out.println("main:" + i);
		test();
		test();
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
		System.out.println("main:" + U.i);
		U.test();
	}
}
