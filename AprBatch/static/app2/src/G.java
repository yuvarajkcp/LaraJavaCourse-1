class G
{
	static int i = test1();
	static int j = test2();

	static
	{
		System.out.println("from SIB " + i + ", " + j);
	}

	static int test1()
	{
		System.out.println("from test1 " + i + ", " + j);
		return 10;
	}

	static int test2()
	{
		System.out.println("from test2 " + i + ", " + j);
		return 20;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i + ", " + j);
	}
}
