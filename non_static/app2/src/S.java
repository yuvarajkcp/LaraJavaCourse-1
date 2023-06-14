class S
{	     		         
	S()
	{
		System.out.println("S()");
	}

	S(int i)
	{
		S();
		System.out.println("R(int)");
	}

	public static void main(String[] args) 
	{
		S obj1 = new S();
		System.out.println("----------");
		S obj2 = new S(10);
		System.out.println("----------");
	}
}
/*
 cannot find symbol
                S();
                ^
				*/