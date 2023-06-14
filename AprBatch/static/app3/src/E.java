class E
{
	static int i;
	static int j = test();

	static int test()
	{
		System.out.println(i); //in direct read
		i = 30; //in direct write
		return 20;
	}


	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
