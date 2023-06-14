class L2
{
	static int test1()
	{
		return j;
	}

	static int i=test2();

	static int j=test2();


	static int test2()
	{
		return i=90;
	}
	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
}


//90, 90