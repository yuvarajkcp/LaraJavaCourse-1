class A 
{
	static int i;
	static int j;

	static
	{
		System.out.println(i); // direct read
		System.out.println(j); // direct read
		i = 10; //direct write
		j = 20; //direct write
		test();
	}
	static void test()
	{
		System.out.println(i); // indirect read
		System.out.println(j); // indirect read
		i = 10; //indirect write
		j = 20; //indirect write
	}

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
