class W
{
	public static void main(String[] args) 
	{
		int i = 0;
		if(false || (i++ == 0))
		{
		System.out.println("if block:" + i++);
	}
			System.out.println("main end:" + i);
}
}