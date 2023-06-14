class I
{

	static   //1st
	{
		System.out.println(i); //here i is not declare
	}

	static int i;    //2nd

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}


// illegal forward reference


//in this example, first execution will happen then initialization so  error