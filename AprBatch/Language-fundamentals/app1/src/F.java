class F
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from outer-if block");
		}
		else
		{
			if(true)
			{
				if(false)
				{
					System.out.println("from if-inner-if block");
				}
				else
				{
					if(true)
					{
						System.out.println("from if-else-inner-if block");
					}
					else
					{
						System.out.println("from if-else-inner-else block");
					}
				}
			}
			else
			{
				System.out.println("from inner-else block");
			}
		}
		System.out.println("main end");
	}
}
