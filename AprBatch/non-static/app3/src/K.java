class K
{
	K()
	{
		this(10, 20, 30);
		System.out.println("K()");
	}
	{
		System.out.println("IIB1");
	}
	K(int i)
	{
		//this();
		System.out.println("K(int)");
	}
	static
	{	
		System.out.println("SIB1");
	}
	K(int i, int j)	
	{
		//this(j);
		System.out.println("K(int,int)");
	}
	K(int i, int j, int k)	
	{
		System.out.println("K(int,int,int)");
	}
	static
	{
		System.out.println("SIB2");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[]args)
	{
		K k1 = new K();
		System.out.println("-----");
		K k2 = new K(100);
		System.out.println("-----");
		K k3 = new K(100, 200);
		System.out.println("-----");
		K k4 = new K(100, 200, 300);
		System.out.println("-----");
	}
}
/*
1. SIB
2. this calling statement
3. IIB