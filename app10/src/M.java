class M 
{
	public static void main(String[] args) 
	{
		if(true)
			if(true)
				System.out.println("inner if");
		else
				System.out.println("else 1");
		else
			System.out.println("else 2");
	}
}

//inner if