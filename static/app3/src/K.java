class K
{

	static void test()    //2nd
	{
		System.out.println(i); 
	}

	static 
	{
		test();
	}
	static int i;    //1st

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
0
done
*/

//in this example first initialization will happen then method so no error