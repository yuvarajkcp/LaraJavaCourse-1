class K2
{
	int i;
	static K2 k2 = new K2();
	static
	{
		System.out.println("static: " + k2.i);
	}
}