class O2 
{
	public static void main(String[] args) 
	{
		O2 o1=new O2();
		System.out.println(o1);
		o1=new O2();
		System.out.println(o1);
	}
}
//Abandoned objects are not having any reference
/*
O2@372f7a8d
O2@2f92e0f4
*/
//Abandoned objects are not having any reference.If none of the reference are not pointing to an object, that object ia called as abandoned object
//any object which is not having atleast one reference is called abandoned object
