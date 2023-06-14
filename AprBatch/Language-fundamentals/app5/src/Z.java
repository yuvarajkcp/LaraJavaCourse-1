class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i = 1, System.out.println("init"),System.out.println("init"); 
			i < 5; 
			System.out.println("before change:" + i), i++, System.out.println("after change:" + i))
		{
			System.out.println("loop body:" +  i);
		}
		System.out.println("main end");
	}
}
