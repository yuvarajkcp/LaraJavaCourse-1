class D
{
	static int i = 10;
	static int j = 20;
	
	static
	{
		System.out.println("SIB");
	}
	public static void main(String[] args)
	{
		System.out.println(i + "," + j);
	}
}

/*
SIB
10,20
*/

//static block from top to bottom execute only once before the execution of main method
// A class can have any num of static blocks

