class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i, j;
		for(i = 1, j = 20; i <= 10; i++, j += 3)
		{
			System.out.println("loop body:" +  i + ", " + j);
		}
		System.out.println("main end:" +  i + ", " + j);
	}
}
