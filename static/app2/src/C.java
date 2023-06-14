class C
{
	static int i = 10;
	static int j = 20;
	
	static
	{
		System.out.println("SIB");
	}
	public static void main(String[] args)
	{
		System.out.println(i + "," + j);
	}
	static
	{
		System.out.println("SIB");
	}
	static
	{
		System.out.println("SIB");
	}
}
/*
SIB
SIB
SIB
10,20
*/