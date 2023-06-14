class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1;i <= 10 ; i++)
		 {
			System.out.println("loop begin:" + i);
			if (i <=4)
			{
				continue;   //continue must be last stmt of the block
				System.out.println("if end");
			}
			System.out.println("loop end:" + i);
		 }
				System.out.println("main end");
	}
}


//o/p --> unreachable statement