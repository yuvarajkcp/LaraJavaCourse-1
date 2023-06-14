class O 
{
	public static void main(String[] args) 
	{
		if(true)
			if(false)
				System.out.println("inner if");
		else
				System.out.println("else 1");
		else
			System.out.println("else 2");
	}
}

//else 1