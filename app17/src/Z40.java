class Z40
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		int i = 1;
		test(i++ + i++ + i + i++); //1+2+3+3=9
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
from test:9
main end:4

*/



