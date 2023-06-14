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
 class P6
{
	static
	{
		System.out.println("SIB2 from P6"); 
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + A2.i); 
	}
}

/*
SIB2 from P6
SIB1 from A
SIB2 from A
main:0
*/

//if we save as A2.java name it will get error

//first System.out.println("SIB2 from P6"); executed then "main:" + A2.i); here we are calling A2 so A2 class will executed
//so SIB1 from A
//SIB2 from A
