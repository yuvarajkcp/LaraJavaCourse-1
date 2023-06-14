class J
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
				continue;
			}
					System.out.println("loop end:" + i);
					i++;
		System.out.println("main end:" + i);
	}
}
}

//main end
// loop begin: 1
// loop end: 1
// loop begin:2 
// loop end: 2
// loop begin:3....infinite times