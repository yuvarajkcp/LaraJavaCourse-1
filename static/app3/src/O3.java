class O3
{
	static
	{
		System.out.println("i am from static");
		System.exit(); //argument must given in exit()
	}
	public static void main(String[] args) 
	{
		System.out.println("i am from main");
	}
}

/*
 method exit in class System cannot be applied to given types;
                System.exit();
				*/