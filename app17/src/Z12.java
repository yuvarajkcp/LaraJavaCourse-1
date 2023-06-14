class Z12
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		String b1 = test1();
		System.out.println("main end:" + b1);
	}
	public static  String test1() 
	{
		System.out.println("from test1");
		return "Hello";
	}
				
}

/* 
main begin
from test1
main end:Hello

*/
