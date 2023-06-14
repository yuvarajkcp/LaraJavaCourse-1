class  A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class F   //no inheritance taking place
{
	A obj;
	F(A obj)
	{
		this.obj = obj;
	}
	void test2()
	{
		System.out.println("F-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		A a1 = new A();
		F f1 = new F(a1);
		f1.test2();

		F f2 = new F(new A());
		f2.test2();
	}
}
/*

D:\april-batch-lab\inheritance\app2\src>java -cp ../classes F
F-test2
0
A-test1
F-test2
0
A-test1
*/
