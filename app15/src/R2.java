class  R2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.2, 4.5, 7.0};
		for (double doubleElements : elements)				//for-each (JDK 1.5)
		{
			System.out.println((int)doubleElements);
		}
		System.out.println("main end");
	}
}



//main begin
//1
//4
//7
//main end