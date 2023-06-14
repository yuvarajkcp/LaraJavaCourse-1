class A 
{
	static int i;
	static int j;

	static
	{
		System.out.println(i); //direct read
		System.out.println(j);//
		i = 10;
		j = 20;
		test();
	}
	static void test()
	{
		System.out.println(i);
		System.out.println(j);
		i = 10;
		j = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
0
0
10
20
done
*/
