class Z18
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		test(200);
		System.out.println("main end");
	}
	public static  void test(int i) 
	{
		System.out.println("from test:" + i);
	}
				
}

/* 
main begin
from test:200
main end
*/