class  Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String[] elements = {"hello", "test", "123", "567", "true", "#$%"};
		for (String element : elements) //for-each (JDK 1.5)
		{
			System.out.println(element);
		}
		System.out.println("main end");
	}
}




//main begin
//hello
//test
//123
//567
//true
//#$%
//main end