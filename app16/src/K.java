class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5)
		{
			System.out.println("loop begin:" + i);
			if (i == 3)
			{
				i++;
				continue;
			}
					System.out.println("loop end:" + i);
					i++;
		System.out.println("main end:" + i);
	}
}
}

//main begin
//loop begin:1
//loop end:1
//main end:2
//loop begin:2
//loop end:2
//main end:3
//loop begin:3
//loop begin:4
//loop end:4
//main end:5
//loop begin:5
//loop end:5
//main end:6