class U2
{
	int i;
	static U2 test() //U-derived data type
	{
		U2 u1=new U2();
		System.out.println(u1.i);
		u1.i=20;
		System.out.println(u1.i);
		return u1;
	}
	public static void main(String[] args) 
	{
		U2 obj=test();
		System.out.println(obj.i);
		obj.i=40;
		System.out.println(obj.i);

		U2 anitha=test();
		System.out.println(anitha.i);
		anitha.i=80;
		System.out.println(anitha.i);
	}
}

//U2 obj & U2 anitha are different
/*
0
20
20
40
0
20
20
80
*/
//when U2 obj=test(); test block is executed and the value of i is erased
//again when U2 anitha=test(); i value will be 0
