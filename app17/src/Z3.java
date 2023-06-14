class Z3
{
	public static  void main(String[] args)  
	{
		System.out.println("main begin"); 
		int i = 10 + test();
		System.out.println("-------------");
		System.out.println( test() + "in the main@a");
		System.out.println("-------------");
		System.out.println( i + test() + "in the main@b");
		System.out.println("-------------");
		System.out.println( i + test() + test() + "in the main@c"); //here + means addition
		System.out.println("-------------");
		System.out.println( "@d:" + i + test() + test() + test()); //string + i + ...--> + means concadenation
		System.out.println("main end");
	}
	public static  int test() 
	{
		System.out.println("from test");
		return 100;
	}
}
/*
main begin
from test
-------------
from test
100in the main@a
-------------
from test
210in the main@b
-------------
from test
from test
310in the main@c
-------------
from test
from test
from test
@d:110100100100
main end
*/