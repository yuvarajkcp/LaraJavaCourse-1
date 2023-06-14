class N2
{
	static int i;
	public static void main(String[]args)
	{
		N2 n1 = new N2();
		N2 n2 = new N2();
		n1.i = 10;
		System.out.println(n2.i);
		n2.i = 20;
		System.out.println(n1.i);
		
	}
}