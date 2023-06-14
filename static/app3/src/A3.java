 class A3
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
 class P6
{
	static
	{
		System.out.println("SIB2 from P6"); 
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + A3.i); 
	}
}

/*
SIB2 from P6
SIB1 from A
SIB2 from A
main:0
*/