 class A2
{
	static int i;
	static
	{
		System.out.println("SIB1 from A"); 
	}
	static
	{
		System.out.println("SIB2 from A"); 
	}
}
 class P6A
{
	static
	{
		System.out.println("SIB2 from P6"); 
	}
	public static void main(String[] args) 
	{
		System.out.println("main:"); 
	}
}

/*
SIB2 from P6
main:

*/
