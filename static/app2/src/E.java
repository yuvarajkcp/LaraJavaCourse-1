class E
{
	static int i = test1();
	static int j = test2();
	
	static
	{
		System.out.println("from SIB"); //one time it will execute
	}

	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}

	static int test2()
	{
		System.out.println("from test2");
		return 20;
	}

	public static void main(String[] args)
	{
		System.out.println("main:" + i + "," + j);
	}
}


/*

from test1
from test2
from SIB
main:10,20


*/

//before class method static process takes place