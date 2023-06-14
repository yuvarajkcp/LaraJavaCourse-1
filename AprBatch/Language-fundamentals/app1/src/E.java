class E
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from if block");
		}
		else
		{
			if(false)
			{
				System.out.println("from inner-if block");
			}
			else
			{
				System.out.println("from inner-else block");
			}
		}
		System.out.println("main end");
	}
}
