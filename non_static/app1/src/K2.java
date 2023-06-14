/*class  K2
{
	int i;
	static K2 k2 = new K2();
	static
	{
		System.out.println("static: "+ k2.i);
	}
	public static void main(String [] args)
	{
		System.out.println("main: " + k2.i);
	}
}*/
/*
static: 0
main: 0
*/

class  K2
{
	int i;
	 K2 k2 = new K2();
	static
	{
		System.out.println("static: "+ k2.i);
	}
	/*public static void main(String [] args)
	{
		System.out.println("main: " + k2.i);
	}*/
}

// error