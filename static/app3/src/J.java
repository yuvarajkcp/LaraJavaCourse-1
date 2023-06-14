class J
{

	static 
	{
		System.out.println(J.i); //indirect reference
	}

	static int i;

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}

/*
0
done
*/