 class A2
{
	static int i;
	static void test()
	{
		System.out.println("from A2.test"); 
	}
	static 
	{
		System.out.println("from A2.SIB"); 
	}
}
class B1
{
		static int j;
	static void test()
	{
		System.out.println("from B1.test"); 
	}
	static 
	{
		System.out.println("from B1.SIB"); 
	}
}
	
 class T
{
static 
	{
		System.out.println("from T.SIB"); 
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin" ); 
		A2.test();
		System.out.println("-----------" ); 
		B1.test();
		System.out.println("-----------" ); 
		System.out.println(A2.i );
		System.out.println("-----------" ); 
		System.out.println(B1.j);
		System.out.println("-----------" ); 
		A2.test();
		System.out.println("-----------" ); 
		B1.test();
		System.out.println("-----------" ); 
		System.out.println("main end" ); 
	}
}
/*
from T.SIB
main begin
from A2.SIB
from A2.test
-----------
from B1.SIB
from B1.test
-----------
0
-----------
0
-----------
from A2.test
-----------
from B1.test
-----------
main end
*/

//if  cls A2 and B class are already executed(loaded) then if we call second time(multiple times) it will not again executed