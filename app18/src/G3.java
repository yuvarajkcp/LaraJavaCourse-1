class  G3
{
	public static void main(String[] args) 
	{
		int i = 10;
		switch(i)
		{
			case 2:
				System.out.println("from case 2");
			case 3:
				System.out.println("from case 3");
				break;
			case 5:
				System.out.println("from case 5");
				break;
			default:
				System.out.println("from default");
		}
				System.out.println("main end");
	}
}
/*
from default
main end

*/