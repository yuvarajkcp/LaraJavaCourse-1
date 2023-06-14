class G17 
{
	public static void main(String[] args) 
	{
		{
			{
				int i = 10;
				System.out.println("innerNormalBlock: " + i);
			}
			System.out.println("outerNormalBlock: " + i);
		}
		System.out.println("main end: " + i);
	}
}
