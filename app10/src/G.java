class G
{
	public static void main(String[] args) 
	{
		if(false)
		{
		System.out.println("from outer-if block");
		}
		else
		{
			if(true)
			{
				if(false)
			{
				System.out.println("from if-else-inner-if block");
			}
				else
				{
					if(true)
				{
					System.out.println("from if-else-inner-if-else block");
		}
		}
	}
		else
		{	
		System.out.println("from inner-else block");
	}
	}
		System.out.println("main end");
}
}
/*
from if-else-inner-if-else block
main end
*/
