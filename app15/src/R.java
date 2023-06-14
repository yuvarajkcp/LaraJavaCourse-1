class  R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.2, 4.5, 7.0};
		for (int element : elements) //for-each (JDK 1.5)
		{
			System.out.println(element);
		}
		System.out.println("main end");
	}
}


// o/p -->  incompatible types: possible lossy conversion from double to int
