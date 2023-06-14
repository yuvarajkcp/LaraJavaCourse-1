class R
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double[] elements = {1.2, 4.5, 7.0};
		for(int i = 0; i < elements.length; i++)
		{
			System.out.println(elements[i]);
		}
		System.out.println();
		for(double doubleElements : elements)
		{
			System.out.println(doubleElements);
		}
		System.out.println("main end");
	}
}
