class LL 
{
	static int i = test1();
	static int j = test2();

	static
	{
		System.out.println("sib: " + "i:" + i + "," + "j:" + j);
		i += 1;
		j += i;
		main(null);
		System.out.println("sibAgain: "+ "i:" + i + "," + "j:" + j);
		i += 2;
		j += i;
	}

	public static int test1()
	{
		System.out.println("test1: "+ "i:" + i + "," + "j:" + j);
		i += 3;
		j += i;
		main(null);
		System.out.println("test1Again: "+ "i:" + i + "," + "j:" + j);
		i += 4;
		j += i;
		return i + j + 5;
	}

	public static int test2()
	{
		System.out.println("test2: "+ "i:" + i + "," + "j:" + j);
		i += 6;
		j += i;
		main(null); 
		System.out.println("test2Again: "+ "i:" + i + "," + "j:" + j);
		i += 7;
		j += i;
		return i + j + 8;
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i);
		i += 9;
		j += i;
	}
}

/*
test1: i:0,j:0
main:3
test1Again: i:12,j:15
test2: i:52,j:31
main:58
test2Again: i:67,j:156
sib: i:74,j:312
main:75
sibAgain: i:84,j:471
main:86
*/
