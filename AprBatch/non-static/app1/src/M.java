class M
{
	static 
	{
		System.out.println(M.i);
	}
	static int i = 200;
	static
	{
		System.out.println(i);
		i = 100;
		System.out.println(i);
	} 
	public static void main(String[] args)
	{
	}
}
