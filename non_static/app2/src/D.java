class  D
{
	int i;
	int j=20;
	D()
	{
		System.out.println("from D()");
		i=10;
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println("------");
		System.out.println(d1.i);
		System.out.println(d1.j);
	}
}

/*
from D()
------
10
20

non-static members can be used straight away in the non-static context without a reference variable.

*/
