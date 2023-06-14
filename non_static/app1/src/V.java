class V 
{
	int i;
	static V test()//method return type can be class or derived data type
	{
		return new V(); //while returning also we cn create the object
	}
	public static void main(String[] args) 
	{
		V v1=test();//test method now having V class object
		System.out.println(v1.i);
	}
}

//0

//if we find anywhere "new" then definitely it is creation of object only