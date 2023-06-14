class F
{
	public static void main(String[] args) 
	{
		if(false)
		{
		System.out.println("from if block");
		}
		else
		{
			if(true)
			{
			if(false)
			{
		System.out.println("from if-inner-if block");
		}
		else
		{	
		System.out.println("from inner-else block");
	}
		}
		System.out.println("main end");
}
}
}

/*
from inner-else block
main end

*/