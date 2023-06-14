class O 
{
	int i;
	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = o1; //or O o2; o2=o1;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o2.i);
		o2.i = 20;
		System.out.println(o1.i);
	}
}

//one object can have many reference variables
//one object can be pointed/refered by any no. of references
//changes in one reference refelecting to all the references that are pointing to that object
//A reference can be point to only one object at a time.
