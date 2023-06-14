class J
{
	J()
	{
		System.out.println("J()");	
	}
	J(int i)
	{
		System.out.println("J(int)");
	}
	public static void main(String[] args)
	{
		J ji = new J();
		System.out.println("-----");
		J j2 = new J(20);
		System.out.println("-----");
		J j3 = new J();
		System.out.println("-----");
		J j4 = new J(50);
		System.out.println("-----");
	}
}
//according to the calling. while creating the object, constructor will be executing.
//one constructor can be called any no. of time. but we need to create the object for calling the constructor.