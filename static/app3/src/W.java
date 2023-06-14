class W 
{
	public static void main(String[] args) 
	{
		System.out.println("W main begin");
		V.main(args); //we have send arguments or it should be null while referring another class file otherwise error
		System.out.println("W main end");
	}
	static
	{
		System.out.println("W. SIB ");
	}
}

/*
W. SIB
W main begin
SIB from V
main from V
W main end

*/

