class K1
{

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
10
done
*/
