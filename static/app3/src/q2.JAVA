 class A2
{
	static void test()
	{
		System.out.println("from A2.test"); 
	}
	static 
	{
		System.out.println("from A2.SIB1"); 
	}
}
	
 class Q2
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
from A2.SIB1
from A2.test
main end
*/

//WHILE CALLING CLASS A2 ALL STATIC BLOCK IN A2 ARE EXECUTED