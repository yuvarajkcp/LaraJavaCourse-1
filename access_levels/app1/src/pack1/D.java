package pack1;
class  D
{
	private void test()
	{
		System.out.println("from test()");
	}
}
class E
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
		System.out.println("done");
	}
}
/*
D:\april-batch-lab\access_levels\app1\src>javac -d ../classes pack1/D.java
pack1\D.java:14: error: test() has private access in D
                d1.test();
                  */