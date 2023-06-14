class B
{
	static int i;
	static int j;

	static
	{
		System.out.println(B.i); // in direct read
		System.out.println(B.j); // in direct read
		B.i = 10; //in direct write
		B.j = 20; //in direct write
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
