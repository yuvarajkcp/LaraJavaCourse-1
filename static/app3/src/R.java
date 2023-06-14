 class A2
{
	static void test()
	{
		System.out.println("from A2.test"); 
	}
}
class B
{
	static void test()
	{
		System.out.println("from B.test"); 
	}
}
	
 class R
{
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
main begin
from A2.test
-----------
from B.test
-----------
main end

*/