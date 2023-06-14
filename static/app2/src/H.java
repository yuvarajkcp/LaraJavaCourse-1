class H 
{
	static int i = test1();
	static int j = test2();

	static
	{
		System.out.println("from SIB:" + i + "," + j);
		i += 1;
		j += 2;
	}

	static int test1()
	{
		System.out.println("from test1:" + i + "," + j);
		i += 3;
		j += 4;
		return i+j+10;
	}

	static int test2()
	{
		System.out.println("from test2:" + i + "," + j);
		i +=j+5;   // i = i + j + 5
		j += i+6;  // j = j + i + 6
		return i+j+20;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i + "," + j);
	}
}

/* 
from test1:0,0
from test2:17,4
from SIB:26,82
main:27,84
*/
