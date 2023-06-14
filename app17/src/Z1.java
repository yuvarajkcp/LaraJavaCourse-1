class Z1
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		System.out.println("in the main:" + test()); //or System.out.println(test());
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
in the main:100
main end

*/