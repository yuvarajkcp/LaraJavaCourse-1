class K2
{
	static 
	{
		System.out.println(i);
	}

	static void test()
	{
		System.out.println(i=10); 
	}

	static 
	{
		test();
	}
	static int i;

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
 illegal forward reference
                System.out.println(i);
                                   ^
								   */
//here without declaring i, we are using i in static block so error