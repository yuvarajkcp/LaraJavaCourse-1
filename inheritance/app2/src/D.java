class  A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class D  //no inheritance taking place
{
	A obj;    //class data type obj will have default value null
	void test2()
	{
		System.out.println("D-test2");
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test2();
	}
}
//we cannot able to call anything on the null reference. If we call we get NullPointerReference
/*
D:\april-batch-lab\inheritance\app2\src>java -cp ../classes D
D-test2
Exception in thread "main" java.lang.NullPointerException: Cannot read field "i" because "this.obj" is null
        at D.test2(D.java:15)
        at D.main(D.java:21)
*/