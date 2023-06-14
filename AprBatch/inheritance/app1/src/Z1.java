class X
{
	static int i;
	static int test1()
	{
		return (1 * 6) + ++i;
	}
	static int j = test1() * test1();
	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(j + j);
	}
}