class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for( ; i <= 5; )
		{
		System.out.println("loop body:" + (i += 2));
	}
			System.out.println("main end:" + i);
}
}