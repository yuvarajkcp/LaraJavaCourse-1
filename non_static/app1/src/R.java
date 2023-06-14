class R 
{
	int i;
	static void test(R obj)
	{
		obj.i=20;
	}
	public static void main(String[] args) 
	{
		R r1=new R();
		r1.i=10;
		System.out.println("A: " + r1.i);
		test(r1);
		//pass by reference/call by reference
		//changes in the destination reflecting to the source
		System.out.println("B: " + r1.i);
	}
}
/*
A: 10
B: 20
*/
