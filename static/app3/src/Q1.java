 class A2
{
	static void test()
	{
		System.out.println("from A2.test"); 
	}
}
	
 class Q1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin" ); 
		A2.test();
		System.out.println("main end" ); 
	}
}
/*
main begin
from A2.test
main end

*/