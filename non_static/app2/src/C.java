class C 
{
	int i;
	C()
	{
		System.out.println("from C()");
		i=10;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("------");
		System.out.println(c1.i);
	}
}
/*
from C()
------
10

*/