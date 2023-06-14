class O1
{
	static
	{
		System.out.println("i am from static");
		System.exit(10000); // due to exit() we are getting output
	}
	public static void main(String[] args) 
	{
		System.out.println("i am from main");
	}
}


//i am from static