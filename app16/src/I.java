class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i++ <= 5);
					System.out.println("loop begin:" + i);
					System.out.println("loop end:" + i);
					i++;
		System.out.println("main end:" + i);
	}
}

//main begin
//loop begin:7
//loop end:7
//main end:8