class X
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin");
		test();//executed
		System.out.println("main end");
	}
	public static  int test()//return type int  return value int 
	{
		System.out.println("from test");
		return 100;
	}
				
	}

/*
main begin
from test
main end
*/
