class C1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <=5; ++i, System.out.println(i))
		{
			System.out.println("loop body begin: " + i);
				int j = 20;
				j++;
				j += 20; // j = j + 20
			System.out.println("loop body end: " + j);
	}
				System.out.println("main end");
}
}
