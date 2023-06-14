class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static
	{
		
		System.out.println("SIB");
		main(null);
	}
}


/*

SIB
main
main


*/


// first static will execute
