class U
{
	int i;
	static U test() //U-derived data type
	{
		U u1=new U();
		System.out.println(u1.i);
		u1.i=20;
		System.out.println(u1.i);
		return u1;
	}
	public static void main(String[] args) 
	{
		U obj=test();
		System.out.println(obj.i);
		obj.i=40;
		System.out.println(obj.i);
	}
}
/*
0
20
20
40
*/