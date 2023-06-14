class M2 
{
	//IIB block(Intance Initialization Block)
	//this will be executed while objects are created b4 the execution of constructor
	//IIB comes under non-static
	{
		System.out.println(i);  
	}
		int i = 200;

	public static void main(String[] args) 
	{
		M2 m2 = new M2();
	}
}

/*error: illegal forward reference
                System.out.println(i);  //IIB block
                                   ^
*/
