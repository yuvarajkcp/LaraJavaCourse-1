class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while(i <= 5);   // while loop retains true
		{
					System.out.println("loop begin:" + i);
					System.out.println("loop end:" + i);
					i++;
		}
		System.out.println("main end:" + i);
	}
}


//main begin 