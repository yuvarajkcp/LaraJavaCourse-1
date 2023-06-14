class M2
{
	//IIB(Instance Initialization block)
	//this will be executed while objects are created before the execution of construtor.
	//non-static block
	{
	   System.out.println(i);
	}

	int i;
	
	public static void main(String[] args)
	{
		M2 m2 = new M2();
	}
}
//illegal forward reference applies to non-static variable also.
