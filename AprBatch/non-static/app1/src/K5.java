class K5
{
	int j;//(non-static member)this member will be loaded each and every time whenever we are creating object of K5 class, different copy of the same j will be loaded to the memory with the default value 0.
	static int i;//(static member) this member will loading while class K5 is loading to the memory with default value 0. while creating the objet for K5 class this member will not be loading again because it is already loaded while K5 class is loading. each and every object of K5 class will be sharing the same copy of static int i.

	static K5 k5 = new K5();
	static K5 k52 = new K5();

	static 
	{
		System.out.println("SIB begin: " + i);
		k5.i = 50;
		K5.i = 60;
		i = 80;
		System.out.println("SIB end: " + i);	
	}

	public static void main(String[] args)
	{
		System.out.println("main: " + i);
	}
}