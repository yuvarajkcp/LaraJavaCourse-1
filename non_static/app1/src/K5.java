class  K5
{
	int j;//(non-static member)this member will be loaded each and every time whenver we creating object of K5 class, different copy of the same j will be loaded to the memory with the default value 0.

	static int i;//(static member) this member will loading while class K5 is loading to the memory with default value 0. while creating the object for K5 CLASS THIS MEMBER WILL NOT E LOADING AGAIN BECOZ IT IS ALREADY LOADED while K5 is loading.each and every object of K5 will be sharing the same copy of static int i.

	static K5 k5 = new K5();

	static
	{
		System.out.println("SIB begin: " + i);
		k5.i = 50;
		k5.i = 60;
		i = 80;
		System.out.println("SIB end: " + i);
	}

	public static void main(String [] args)
	{
		System.out.println("main: " + i);
	}
}

/*
SIB begin: 0
SIB end: 80
main: 80
*/