class  A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class C1
{
	A obj;
	void test2()
	{
		System.out.println("C1-test2");
		//System.out.println(i);
		//test1();
	}
	public static void main(String[] args) 
	{
		C1 c1 = new C1();
		System.out.println(c1.obj);
		c1.test2();
	}
}
/*

D:\april-batch-lab\inheritance\app2\src>java -cp ../classes C1
null
C1-test2
*/