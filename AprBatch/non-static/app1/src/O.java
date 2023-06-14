class O
{
	int i;
	public static void main(String[]args)	
	{
		O o1 = new O();
		System.out.println(o2);
		o2 = o1;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o2.i);
		System.out.println(o1.i);
		o2.i = 20;
		System.out.println(o1.i);
		System.out.println(o2.i);
	}
}
//one object can have any no. of references.
//one object can be pointed by any no. of references.
//changes in one reference reflecting to all the references that are pointing to that object.
//a reference can point to only one object at a time.