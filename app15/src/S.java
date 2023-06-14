class  S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.2, 4.5, 7.0};
		double elements;					//elements must be declare inside the loop
		for (elements : elements)				//for-each (JDK 1.5)
		{
			System.out.println(elements);
		}
		System.out.println("main end");
	}
}


//o/p -->bad initializer for for-loop
               // for (elements : elements)  