class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 3; i <= 5; i++)
		{
			System.out.println("loop body begin: " + i);
			int j = 20;
			j++;
			//j += 20;//j = j + 20
			j = j + 20;
			System.out.println("loop body end:" + j);
		}
		System.out.println("main end" + j);
	}
}
