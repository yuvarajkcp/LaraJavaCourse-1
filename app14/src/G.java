class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for( ; i <= 5; )
		{
		System.out.println("loop body:" + i++);//1,2,3,4,5
	}
			System.out.println("main end:" + i);
}
}