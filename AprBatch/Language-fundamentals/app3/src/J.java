class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		
		int i = 0;
		{
			System.out.println("block1: " + i++);
		}
		if(i++ == 0 && i++ == 0);
		else
		{
			System.out.println("else: " + i++);
			i++;
		}
		{
			System.out.println("block2: " + i++);
		}
		System.out.println("main end: " + i);
	}
}
