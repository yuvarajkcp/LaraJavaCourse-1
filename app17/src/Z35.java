class Z35
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		int i = 1;
		test(i + 20);
		System.out.println("main end:" + i);  
	}
	public static  void test(int i)
	{
				
		System.out.println("from test:" + i);
		i = 30;
	}
				
}

/*

main begin
from test:21
main end:1

*/