class  C2
{
	int i=100;
	C2()
	{
		System.out.println("from C2()");
		i=10;
	}
	public static void main(String[] args) 
	{
		C2 c1 = new C2();
		System.out.println("------");
		System.out.println(c1.i);
	}
}
/*
from C2()
------
10
*/