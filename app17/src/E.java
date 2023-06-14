class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("--------");
		test();
		System.out.println("--------");
		test();
		System.out.println("--------");
		test();
		System.out.println("main end");
	}
	public static void test() 
	{
		System.out.println("from test");
	}
}

/*

D:\april-batch-lab\app17\src>javac -d ../classes e.java  ---> 

D:\april-batch-lab\app17\src>java -cp ../classes E
main begin
from test
--------
from test
--------
from test
--------
from test
main end