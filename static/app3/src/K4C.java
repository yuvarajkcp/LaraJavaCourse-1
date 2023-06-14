class K4C
{
	static int test()
	{
		return i=90;
	}
	static int i;
	static int j=i;

	public static void main(String[] args)
	{
		System.out.println("done: " + test());
		System.out.println("done: " + j);

	}
}


/*
done: 90
done: 0
\*