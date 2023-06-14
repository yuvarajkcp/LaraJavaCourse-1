class  Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		X.test();  //der is no X class
		System.out.println("main end");
	}
}
/*
 cannot find symbol
                X.test();
				*/