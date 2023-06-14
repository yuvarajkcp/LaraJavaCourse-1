class L
{
	static int i = test();

	public static int test()
	{
		System.out.println("test begin:" + i);
		i = 1;
		main(null);
		System.out.println("test end:" + i);
		i = 2;
		return i + 2;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		i += 5;
	}
	static
	{	
		System.out.println("SIB begin:" + i);
		i = 3;
		main(null);
		System.out.println("SIB end:" + i);
	}
}
