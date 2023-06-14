class  M
{
	public static void main(String[] args) 
	{
		String i = "abc";
		switch(i)
		{
			case 1:
				System.out.println("from case xyz");
			    break;		
			case 2:
				System.out.println("from case def");
				break;
			case 3:
				System.out.println("from case abc");
				break;
		}
	}
}

/* 3 times error, incompatible types: int cannot be converted to String */