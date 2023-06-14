class L1 
{
	static int test1()
	{
		return j;
	}

	static int i=test1();

	static int j=10;

	static int test2()
	{
		return i=90;
	}
	public static void main(String[] args) 
	{
		System.out.println(i+","+j);
	}
}

//0,10