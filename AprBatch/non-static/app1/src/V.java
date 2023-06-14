class V
{
	int i;
	static V test()//method return type can be class type
	{
		return new V();//while returning also we can create the object
	}
	public static void main(String[] args)
	{
		V v1 = test();//test method now having V class object
		System.out.println(v1.i);
	}
}
//if you find anywhere 'new' then definately it is creation of object only