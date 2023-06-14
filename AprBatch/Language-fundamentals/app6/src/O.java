class O
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		loop1:
		for(int i = 1; i <= 2; i++)
		{
			System.out.println("outer loop begin:" + i);
			loop2:
			for(int j = 100; j <= 104; j++)
			{
				System.out.println("inner loop begin:" + i + "," + j);
				if(j == 103)
				{
					continue loop1;
				}
				System.out.println("inner loop end:" + i + "," + j);
			}
			System.out.println("outer loop end:" + i);
		}
		System.out.println("main end");
	}
}
