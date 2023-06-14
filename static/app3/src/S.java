 class A2
{
	static void test()
	{
		System.out.println("from A2.test"); 
	}
	static 
	{
		System.out.println("from A2.SIB"); 
	}
}
class B
{
	static void test()
	{
		System.out.println("from B.test"); 
	}
	static 
	{
		System.out.println("from B.SIB"); 
	}
}
	
 class S
{
static 
	{
		System.out.println("from S.SIB"); 
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin" ); 
		A2.test();
		System.out.println("-----------" ); 
		B.test();
		System.out.println("-----------" ); 
		System.out.println("main end" ); 
	}
}


/*
from S.SIB
main begin
from A2.SIB
from A2.test
-----------
from B.SIB
from B.test
-----------
main end
*/

//first static block executed then test method