 class A2
{
	static int i;
}
 class P4
{
	public static void main(String[] args) 
	{
		System.out.println("main:" + i); 
		System.out.println("main:" + A2.i);
	}
}

/*
 error: cannot find symbol
                System.out.println("main:" + i);
                                             ^
											 */
//i is defined in another cls so error