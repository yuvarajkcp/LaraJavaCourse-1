class N 
{
	public static void main(String[] args) 
	{
		if(false)
			if(true)
				System.out.println("inner if");
		else
				System.out.println("else 1");
		else
			System.out.println("else 2");
	}
}

//else 2