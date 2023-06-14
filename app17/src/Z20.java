class Z20
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		test(200);
		System.out.println("main end:");  //i is not defined
	}
	public static  void test(int i) 
	{
		System.out.println("from test:" + i);
		i = 30;			//i value reinitializing to 30
		System.out.println("from test:" + i);
	}
				
}

/* 
main begin
from test:200
from test:30
main end:

*/